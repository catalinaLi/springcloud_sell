package top.catalinali.product.server.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.catalinali.product.server.ProductApplicationTests;
import top.catalinali.product.server.dataobject.ProductCategory;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 16:53 2018/6/1
 * @Modefied by:
 */
public class CategoryServiceTest extends ProductApplicationTests {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(1, 2));
        Assert.assertTrue(list.size() > 0);
    }

}