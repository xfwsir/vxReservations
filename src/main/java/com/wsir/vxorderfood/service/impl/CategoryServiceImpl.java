package com.wsir.vxorderfood.service.impl;

import com.wsir.vxorderfood.entity.ProductCategory;
import com.wsir.vxorderfood.mapper.ProductCategoryMapper;
import com.wsir.vxorderfood.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryMapper mapper;

    @Override
    public ProductCategory selectByCategoryType(Integer categoryType) {
        return mapper.selectByCategoryType(categoryType);
    }
}
