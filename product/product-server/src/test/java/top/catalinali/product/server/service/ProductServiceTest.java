package top.catalinali.product.server.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import top.catalinali.product.common.DecreaseStockInput;
import top.catalinali.product.common.ProductInfoOutput;
import top.catalinali.product.server.ProductApplicationTests;
import top.catalinali.product.server.dataobject.ProductInfo;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 14:37 2018/6/6
 * @Modefied by:
 */

public class ProductServiceTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> list = productService.findUpAll();
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void findList() throws Exception {
        List<ProductInfoOutput> list = productService.findList(Arrays.asList("123456", "1234568"));
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void decreaseStock() throws Exception {
        DecreaseStockInput decreaseStockInput = new DecreaseStockInput("123456", 1);
        productService.decreaseStock(Arrays.asList(decreaseStockInput));
    }
}