package top.catalinali.order.server.enums;

import lombok.Getter;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 14:52 2018/6/4
 * @Modefied by:
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "取消"),
    ;
    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
