package top.catalinali.order.server.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 16:52 2018/6/22
 * @Modefied by:
 */
@Component
@Slf4j
public class MqReceiver {

    //@RabbitListener(queues = "myQueue")
    //自动创建队列@RabbitListener(queuesToDeclare = @Queue("myQueue"))
    //自动创建队列，Exchange和Queue绑定
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("myQueue"),
            exchange = @Exchange("myExchange")
    ))
    private void process(String message) {
        log.info("MyQueue = {}", message);
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("myOrder"),
            key = "computer",
            exchange = @Exchange("computerOrder")
    ))
    private void processComputer(String message) {
        log.info("MyQueue = {}", message);
    }
}


