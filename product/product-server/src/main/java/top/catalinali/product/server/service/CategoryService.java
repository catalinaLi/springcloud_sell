package top.catalinali.product.server.service;

import top.catalinali.product.server.dataobject.ProductCategory;

import java.util.List;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 16:52 2018/6/1
 * @Modefied by:
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
