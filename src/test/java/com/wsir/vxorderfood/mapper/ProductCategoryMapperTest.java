package com.wsir.vxorderfood.mapper;

import com.wsir.vxorderfood.entity.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class ProductCategoryMapperTest {

    @Autowired
    ProductCategoryMapper mapper;
    @Test
    public void selectByCategoryType() {
        ProductCategory productCategory = mapper.selectByCategoryType(3);
    }
}