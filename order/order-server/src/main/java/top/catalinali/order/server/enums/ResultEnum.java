package top.catalinali.order.server.enums;

import lombok.Getter;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 15:30 2018/6/4
 * @Modefied by:
 */
@Getter
public enum ResultEnum {
    PARAM_ERROR(1, "参数错误"),
    CART_EMPTY(2, "购物车为空")

    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
