package top.catalinali.order.server.vo;

import lombok.Data;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 15:29 2018/6/4
 * @Modefied by:
 */
@Data
public class ResultVo<T> {

    private Integer code;

    private String msg;

    private T data;
}
