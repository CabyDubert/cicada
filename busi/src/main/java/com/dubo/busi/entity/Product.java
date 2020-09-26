package com.dubo.busi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_product")
public class Product extends Model<Product> {

    @TableId(type = IdType.AUTO)
    private Long id;
//    /**
//     * 货主ID，对应货主表
//     */
//    @TableField(value="cargo_owner_id")
//    private Long cargoOwnerId;

    /**
     * sku_id
     */
    @TableField(value = "sku_id")
    private String skuId;

    /**
     * 名称
     */
    private String name;

    /**
     * 英文名称
     */
    @TableField(value = "name_en")
    private String nameEn;

    /**
     * 海关编码
     */
    @TableField(value = "hs_code")
    private String hsCode;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 条形码
     */
    @TableField(value = "bar_code")
    private String barCode;

    /**
     * 描述
     */
    private String remark;
//    /**
//     * 商品分类
//     */
//    @TableField(value = "goods_categories")
//    private String goodsCategories;
//
//    /**
//     * 货号
//     */
//    @TableField(value = "cargo_number")
//    private String cargoNumber;

    /**
     * 原产国
     */
    @TableField(value = "origin_country")
    private String originCountry;

//    /**
//     * 最小售卖单位
//     */
//    @TableField(value = "min_sale_unit")
//    private String minSaleUnit;
//
//    /**
//     * 是否效期管控0否，1是
//     */
//    @TableField(value = "is_effective_control")
//    private Boolean effectiveControl;

    /**
     * 是否可用，0不可用，1可用
     */
    @TableField(value = "is_enable")
    private Boolean enable;

    /**
     * 创建人
     */
    private Long creator;

    /**
     * 创建时间
     */
    @TableField(value = "ct")
    private Date ct;

    /**
     * 修改人
     */
    private Long modifier;

    /**
     * 修改时间
     */
    @TableField(value = "mt")
    private Date mt;


//    @TableField(value = "up_limit")
//    private Integer upLimit;
//
//    @TableField(value = "lower_limit")
//    private Integer lowerLimit;

    @Override
    protected Serializable pkVal() {
        return id;
    }

//    @TableField(exist = false)
//    private String cargoOwnerName;

}
