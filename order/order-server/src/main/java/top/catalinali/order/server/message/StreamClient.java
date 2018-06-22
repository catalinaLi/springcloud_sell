package top.catalinali.order.server.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 17:02 2018/6/22
 * @Modefied by:
 */
public interface StreamClient {

    String INPUT0 = "myMessage0";
    String INPUT = "myMessage1";
    String INPUT2 = "myMessage2";

    @Input(StreamClient.INPUT)
    SubscribableChannel input();

    @Output("MyOutput")
    MessageChannel output();

    @Input(StreamClient.INPUT2)
    SubscribableChannel input2();

    @Output("MyOutput2")
    MessageChannel output2();
}
