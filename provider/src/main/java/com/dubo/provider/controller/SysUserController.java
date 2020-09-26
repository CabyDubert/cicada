package com.dubo.provider.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dubo.provider.entity.SysUser;
import com.dubo.provider.service.SysUserService;
import io.netty.util.internal.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    SysUserService sysUserService;

    @GetMapping("/findById/{id}")
    public SysUser findById(@PathVariable String id) {
//        JSONObject json = JSON.parseObject(body);
//        String id = json.getString("id");
        SysUser user = sysUserService.getById(id);
        return user;
    }

    @PostMapping("update")
    public void update(@RequestBody String body) {
        String tag = "update sys user";
        JSONObject json = JSON.parseObject(body);
        String id = json.getString("id");
        String userName = json.getString("userName");
        if(StringUtil.isNullOrEmpty(id)){
            throw new RuntimeException("id为空");
        }
        SysUser user = sysUserService.getById(id);
        user.setUserName(userName);
        user.setMt(new Date());
        sysUserService.saveOrUpdate(user);
    }
}
