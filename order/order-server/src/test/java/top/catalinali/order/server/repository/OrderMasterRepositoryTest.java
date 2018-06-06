package top.catalinali.order.server.repository;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.catalinali.order.server.OrderApplicationTests;
import top.catalinali.order.server.dataobject.OrderMaster;
import top.catalinali.order.server.enums.OrderStatusEnum;
import top.catalinali.order.server.enums.PayStatusEnum;

import java.math.BigDecimal;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 14:51 2018/6/4
 * @Modefied by:
 */
public class OrderMasterRepositoryTest extends OrderApplicationTests {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void testSave() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("师兄");
        orderMaster.setBuyerPhone("1886131241241");
        orderMaster.setBuyerAddress("慕课网总部");
        orderMaster.setBuyerOpenid("1101110");
        orderMaster.setOrderAmount(new BigDecimal(2.5));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());

        OrderMaster result = orderMasterRepository.save(orderMaster);
        Assert.assertTrue(result != null);
    }

}