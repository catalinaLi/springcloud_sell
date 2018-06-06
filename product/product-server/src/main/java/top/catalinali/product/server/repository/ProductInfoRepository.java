package top.catalinali.product.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.catalinali.product.server.dataobject.ProductInfo;

import java.util.List;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 14:57 2018/6/1
 * @Modefied by:
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);

    List<ProductInfo> findByProductIdIn(List<String> productIdList);
}
