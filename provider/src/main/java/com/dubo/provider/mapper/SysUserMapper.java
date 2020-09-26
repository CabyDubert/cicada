package com.dubo.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dubo.provider.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}
