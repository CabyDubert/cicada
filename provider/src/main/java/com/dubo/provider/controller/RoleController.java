package com.dubo.provider.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
public class RoleController {

    @GetMapping("/getRole")
    public String getRole(){
        JSONObject json = new JSONObject();
        json.put("name","管理员");
        json.put("grade",1);
        json.put("id",1000001);
        return json.toString();
    }

}
