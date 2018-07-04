package top.catalinali.order.server.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 17:02 2018/6/22
 * @Modefied by:
 */
public interface StreamClient {

    //String INPUT0 = "myMessage0";
    String INPUT = "myMessage1";
    String INPUT2 = "myMessage2";

    /*@Input(StreamClient.INPUT0)
    SubscribableChannel input();*/

    @Output(StreamClient.INPUT)
    MessageChannel output();

   /* @Input(StreamClient.INPUT2)
    SubscribableChannel input2();*/

    @Output(StreamClient.INPUT2)
    MessageChannel output2();
}
