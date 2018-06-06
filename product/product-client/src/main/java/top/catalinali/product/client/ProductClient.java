package top.catalinali.product.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import top.catalinali.product.common.DecreaseStockInput;
import top.catalinali.product.common.ProductInfoOutput;

import java.util.List;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 13:06 2018/6/6
 * @Modefied by:
 */
@FeignClient(name = "product")
public interface ProductClient {

    @PostMapping("/product/listForOrder")
    List<ProductInfoOutput> listForOrder(@RequestBody List<String> productIdList);

    @PostMapping("/product/decreaseStock")
    void decreaseStock(@RequestBody List<DecreaseStockInput> decreaseStockInputList);
}
