package com.dubo.busi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dubo.busi.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ProductMapper extends BaseMapper<Product> {

}
