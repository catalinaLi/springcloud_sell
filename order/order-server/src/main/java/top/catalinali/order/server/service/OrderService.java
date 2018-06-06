package top.catalinali.order.server.service;

import top.catalinali.order.server.dto.OrderDto;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 15:10 2018/6/4
 * @Modefied by:
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDto create(OrderDto orderDTO);

}
