package top.catalinali.product.server.enums;

import lombok.Getter;

/**
 * @Author: lx
 * @Description: 商品上下架状态
 * @Date: Created on 16:41 2018/6/1
 * @Modefied by:
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架"),
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

