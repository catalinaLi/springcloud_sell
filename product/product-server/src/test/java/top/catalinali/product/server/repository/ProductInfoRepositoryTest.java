package top.catalinali.product.server.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.catalinali.product.server.dataobject.ProductInfo;

import java.util.List;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 14:57 2018/6/1
 * @Modefied by:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void findByProductStatus() {
        List<ProductInfo> list = repository.findByProductStatus(0);
        Assert.assertTrue(list.size() > 0);
    }
}