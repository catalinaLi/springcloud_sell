package top.catalinali.product.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.catalinali.product.server.dataobject.ProductCategory;

import java.util.List;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 14:51 2018/6/1
 * @Modefied by:
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,String> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> types);
}
