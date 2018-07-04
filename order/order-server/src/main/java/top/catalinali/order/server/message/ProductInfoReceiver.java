package top.catalinali.order.server.message;

import com.fasterxml.jackson.core.type.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import top.catalinali.order.server.utils.JsonUtil;
import top.catalinali.product.common.ProductInfoOutput;

import java.util.List;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 17:04 2018/7/4
 * @Modefied by:
 */
@Slf4j
@Component
public class ProductInfoReceiver {

    private static final String PRODUCT_STOCK_TEMPLATE = "product_stock_%s";

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RabbitListener(queuesToDeclare = @Queue("productInfo"))
    public void process(String message) {
        //message 转成  ProductInfoOutput对象
        List<ProductInfoOutput> productInfoOutputList = ( List<ProductInfoOutput>) JsonUtil.fromJson(message,
                new TypeReference<List<ProductInfoOutput>>(){});
        log.info("从队列【{}】接收到消息:{}", "productInfo", productInfoOutputList);

        //储存到redis中
        for(ProductInfoOutput productInfoOutput:productInfoOutputList){
            stringRedisTemplate.opsForValue().set(String.format(PRODUCT_STOCK_TEMPLATE,productInfoOutput.getProductId()),
                    String.valueOf(productInfoOutput.getProductStock()));
        }
    }
}
