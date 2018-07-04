package top.catalinali.order.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.catalinali.order.server.dto.OrderDto;
import top.catalinali.order.server.message.StreamClient;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 17:04 2018/6/22
 * @Modefied by:
 */
@RestController
@RefreshScope
public class SendMessageController {

    @Autowired
    private StreamClient streamClient;

    @Value("${env}")
    private String env;

    @Value("${spring.rabbitmq.username}")
    private String username;


    /*@GetMapping("/sendMessage")
    public void process() {
        String str = "now" + new Date();
        streamClient.output().send(MessageBuilder.withPayload(str).build());
    }*/


    @GetMapping("/sendMessage")
    public void process() {
        OrderDto dto = new OrderDto();
        dto.setOrderId("123456");
        streamClient.output().send(MessageBuilder.withPayload(dto).build());
    }

    @GetMapping("/env")
    public String env() {
        return env;
    }

    @GetMapping("/username")
    public String username() {
        return username;
    }


}
