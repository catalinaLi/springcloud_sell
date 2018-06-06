package top.catalinali.order.server.dto;

import lombok.Data;
import top.catalinali.order.server.dataobject.OrderDetail;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 15:09 2018/6/4
 * @Modefied by:
 */
@Data
public class OrderDto {
    /** 订单id. */
    private String orderId;

    /** 买家名字. */
    private String buyerName;

    /** 买家手机号. */
    private String buyerPhone;

    /** 买家地址. */
    private String buyerAddress;

    /** 买家微信Openid. */
    private String buyerOpenid;

    /** 订单总金额. */
    private BigDecimal orderAmount;

    /** 订单状态, 默认为0新下单. */
    private Integer orderStatus;

    /** 支付状态, 默认为0未支付. */
    private Integer payStatus;

    private List<OrderDetail> orderDetailList;

}
