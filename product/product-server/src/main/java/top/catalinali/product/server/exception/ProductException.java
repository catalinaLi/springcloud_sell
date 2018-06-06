package top.catalinali.product.server.exception;

import top.catalinali.product.server.enums.ResultEnum;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 14:25 2018/6/6
 * @Modefied by:
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
