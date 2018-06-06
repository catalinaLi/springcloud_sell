package top.catalinali.order.server.enums;

import lombok.Getter;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 14:52 2018/6/4
 * @Modefied by:
 */
@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;
    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
