package top.catalinali.product.server.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.catalinali.product.common.DecreaseStockInput;
import top.catalinali.product.common.ProductInfoOutput;
import top.catalinali.product.server.dataobject.ProductInfo;
import top.catalinali.product.server.enums.ProductStatusEnum;
import top.catalinali.product.server.enums.ResultEnum;
import top.catalinali.product.server.exception.ProductException;
import top.catalinali.product.server.repository.ProductInfoRepository;
import top.catalinali.product.server.service.ProductService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 16:37 2018/6/1
 * @Modefied by:
 */
@Service
public class ProductInfoServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository repository;

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public List<ProductInfoOutput> findList(List<String> productIdList) {
        return repository.findByProductIdIn(productIdList).stream()
                .map(e -> {
                    ProductInfoOutput output = new ProductInfoOutput();
                    BeanUtils.copyProperties(e, output);
                    return output;
                }).collect(Collectors.toList());
    }

    @Override
    public void decreaseStock(List<DecreaseStockInput> decreaseStockInputList) {
        for (DecreaseStockInput decreaseStockInput: decreaseStockInputList) {
            Optional<ProductInfo> productInfoOptional = repository.findById(decreaseStockInput.getProductId());
            //判断商品是否存在
            if (!productInfoOptional.isPresent()){
                throw new ProductException(ResultEnum.PRODUCT_NOT_EXIST);
            }

            ProductInfo productInfo = productInfoOptional.get();
            //库存是否足够
            Integer result = productInfo.getProductStock() - decreaseStockInput.getProductQuantity();
            if (result < 0) {
                throw new ProductException(ResultEnum.PRODUCT_STOCK_ERROR);
            }

            productInfo.setProductStock(result);
            repository.save(productInfo);
        }
    }

}
