package top.catalinali.order.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.catalinali.order.server.converter.OrderForm2OrderDtoConverter;
import top.catalinali.order.server.dto.OrderDto;
import top.catalinali.order.server.enums.ResultEnum;
import top.catalinali.order.server.exception.OrderException;
import top.catalinali.order.server.form.OrderForm;
import top.catalinali.order.server.service.OrderService;
import top.catalinali.order.server.utils.ResultVoUtil;
import top.catalinali.order.server.vo.ResultVo;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 15:26 2018/6/4
 * @Modefied by:
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     * 1. 参数检验
     * 2. 查询商品信息(调用商品服务)
     * 3. 计算总价
     * 4. 扣库存(调用商品服务)
     * 5. 订单入库
     */
    @PostMapping("/create")
    public ResultVo<Map<String, String>> create(@Valid OrderForm orderForm,
                                                BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            log.error("【创建订单】参数不正确, orderForm={}", orderForm);
            throw new OrderException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        // orderForm -> OrderDto
        OrderDto OrderDto = OrderForm2OrderDtoConverter.convert(orderForm);
        if (CollectionUtils.isEmpty(OrderDto.getOrderDetailList())) {
            log.error("【创建订单】购物车信息为空");
            throw new OrderException(ResultEnum.CART_EMPTY);
        }

        OrderDto result = orderService.create(OrderDto);

        Map<String, String> map = new HashMap<>();
        map.put("orderId", result.getOrderId());
        return ResultVoUtil.success(map);
    }

}
