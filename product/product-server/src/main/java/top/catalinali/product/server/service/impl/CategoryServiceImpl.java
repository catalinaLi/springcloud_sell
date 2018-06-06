package top.catalinali.product.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.catalinali.product.server.dataobject.ProductCategory;
import top.catalinali.product.server.repository.ProductCategoryRepository;
import top.catalinali.product.server.service.CategoryService;

import java.util.List;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 16:52 2018/6/1
 * @Modefied by:
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
