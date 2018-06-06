package top.catalinali.product.server.service;

import top.catalinali.product.common.DecreaseStockInput;
import top.catalinali.product.common.ProductInfoOutput;
import top.catalinali.product.server.dataobject.ProductInfo;

import java.util.List;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 16:37 2018/6/1
 * @Modefied by:
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param decreaseStockInputList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
