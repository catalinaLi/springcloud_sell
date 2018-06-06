package top.catalinali.product.server.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author: lx
 * @Description:
 * @Date: Created on 17:05 2018/6/1
 * @Modefied by:
 */
@Data
public class ProductVo {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    List<ProductInfoVo> productInfoVoList;
}
