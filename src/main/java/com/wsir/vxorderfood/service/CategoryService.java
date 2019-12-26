package com.wsir.vxorderfood.service;

import com.wsir.vxorderfood.entity.ProductCategory;

import java.util.List;

public interface CategoryService {
    ProductCategory selectByCategoryType(Integer categoryType);
}
