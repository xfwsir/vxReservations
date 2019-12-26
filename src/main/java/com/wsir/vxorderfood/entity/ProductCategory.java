package com.wsir.vxorderfood.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Database Table Remarks:
 *   类目表
 */
@Data
public class ProductCategory implements Serializable {
    private Integer categoryId;
    /*类目名称*/
    private String categoryName;

    /*类目编号*/
    private Integer categoryType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_category
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;
}