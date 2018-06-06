package top.catalinali.product.server.vo;

import lombok.Data;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 17:04 2018/6/1
 * @Modefied by:
 */
@Data
public class ResultVo<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
