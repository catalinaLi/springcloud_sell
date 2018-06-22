package top.catalinali.order.server.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;
import top.catalinali.order.server.dto.OrderDto;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 17:04 2018/6/22
 * @Modefied by:
 */
@Component
@Slf4j
@EnableBinding(StreamClient.class)
public class StreamReceiver {

    /*@StreamListener(StreamClient.INPUT)
    public void process(Object message) {
        log.info("StreamReceiver:{}", message);
    }*/
    @StreamListener(StreamClient.INPUT)
    @SendTo(StreamClient.INPUT2)
    public String process(OrderDto message) {
        log.info("StreamReceiver:{}", message);
        return "receiver";
    }

    @StreamListener(StreamClient.INPUT2)
    public void process2(String message) {
        log.info("StreamReceiver:{}", message);
    }
}
