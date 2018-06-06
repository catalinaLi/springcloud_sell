package top.catalinali.order.server.exception;

import top.catalinali.order.server.enums.ResultEnum;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 15:30 2018/6/4
 * @Modefied by:
 */
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
