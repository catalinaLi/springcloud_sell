package top.catalinali.order.server.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;
import top.catalinali.order.server.dataobject.OrderDetail;
import top.catalinali.order.server.dto.OrderDto;
import top.catalinali.order.server.enums.ResultEnum;
import top.catalinali.order.server.exception.OrderException;
import top.catalinali.order.server.form.OrderForm;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 15:31 2018/6/4
 * @Modefied by:
 */
@Slf4j
public class OrderForm2OrderDtoConverter {
    public static OrderDto convert(OrderForm orderForm) {
        Gson gson = new Gson();
        OrderDto orderDTO = new OrderDto();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {
                    }.getType());
        } catch (Exception e) {
            log.error("【json转换】错误, string={}", orderForm.getItems());
            throw new OrderException(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }
}
