package top.catalinali.order.server.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.catalinali.order.server.dataobject.OrderMaster;
import top.catalinali.order.server.dto.OrderDto;
import top.catalinali.order.server.enums.OrderStatusEnum;
import top.catalinali.order.server.enums.PayStatusEnum;
import top.catalinali.order.server.repository.OrderDetailRepository;
import top.catalinali.order.server.repository.OrderMasterRepository;
import top.catalinali.order.server.service.OrderService;
import top.catalinali.order.server.utils.KeyUtil;

import java.math.BigDecimal;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 15:11 2018/6/4
 * @Modefied by:
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Override
    public OrderDto create(OrderDto orderDto) {
        String orderId = KeyUtil.genUniqueKey();

        //todo 查询商品信息(调用商品服务)

        //todo 计算总价

        //todo 扣库存(调用商品服务)

        //todo 订单入库
        OrderMaster orderMaster = new OrderMaster();
        orderDto.setOrderId(orderId);
        BeanUtils.copyProperties(orderDto, orderMaster);
        orderMaster.setOrderAmount(new BigDecimal(5));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
        orderMasterRepository.save(orderMaster);
        return orderDto;
    }
}
