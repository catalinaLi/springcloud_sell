package top.catalinali.order.server.repository;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.catalinali.order.server.OrderApplicationTests;
import top.catalinali.order.server.dataobject.OrderDetail;

import java.math.BigDecimal;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 14:50 2018/6/4
 * @Modefied by:
 */
public class OrderDetailRepositoryTest extends OrderApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void testSave() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("12367");
        orderDetail.setOrderId("123456");
        orderDetail.setProductIcon("http://xxx.com");
        orderDetail.setProductId("157875196366160022");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(0.01));
        orderDetail.setProductQuantity(2);

        OrderDetail result = orderDetailRepository.save(orderDetail);
        Assert.assertTrue(result != null);
    }

}