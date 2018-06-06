package top.catalinali.product.common;

import lombok.Data;

/**
 * @Author: lx
 * @Description: 减库存入参
 * @Date: Created on 14:16 2018/6/6
 * @Modefied by:
 */
@Data
public class DecreaseStockInput {

    private String productId;

    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
