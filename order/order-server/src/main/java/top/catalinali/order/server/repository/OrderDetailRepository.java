package top.catalinali.order.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.catalinali.order.server.dataobject.OrderDetail;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 14:50 2018/6/4
 * @Modefied by:
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}
