package top.catalinali.product.server.enums;


import lombok.Getter;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 14:25 2018/6/6
 * @Modefied by:
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIST(1, "商品不存在"),
    PRODUCT_STOCK_ERROR(2, "库存有误"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
