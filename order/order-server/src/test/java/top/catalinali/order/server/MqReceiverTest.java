package top.catalinali.order.server;

import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 17:21 2018/6/22
 * @Modefied by:
 */
public class MqReceiverTest extends OrderApplicationTests{

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void send(){
        amqpTemplate.convertAndSend("myQueue","new"+new Date());
    }

    @Test
    public void sendOrder(){
        amqpTemplate.convertAndSend("computerOrder","myOrder","new"+new Date());
    }
}
