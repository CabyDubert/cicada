package com.dubo.busi.service;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dubo.busi.entity.Product;
import com.dubo.busi.mapper.ProductMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService extends ServiceImpl<ProductMapper, Product> {

    @Transactional(rollbackFor = RuntimeException.class)
    public Integer insert(Product entity){
        //验证商品条码+货主的唯一性
        return baseMapper.insert(entity);
    }

    @Transactional(rollbackFor = Exception.class)
    public int update(String body) {
        Product entity = JSON.parseObject(body, Product.class);
        Product po = baseMapper.selectById(entity.getId());
        BeanUtils.copyProperties(entity,po,new String[]{"id"});
        //验证商品条码+货主的唯一性
        return baseMapper.updateById(entity);
    }

}
