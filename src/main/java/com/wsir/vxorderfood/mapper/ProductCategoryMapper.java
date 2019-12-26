package com.wsir.vxorderfood.mapper;

import com.wsir.vxorderfood.entity.ProductCategory;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductCategoryMapper {
    ProductCategory selectByCategoryType(Integer categoryType);
}