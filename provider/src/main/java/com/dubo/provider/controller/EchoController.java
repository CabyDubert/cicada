package com.dubo.provider.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController{
    @GetMapping("/echo/{string}")
    public String echo(@PathVariable String string){
        System.out.println(string);
        return string;
    }

    @GetMapping("/getUser")
    public String getUser(){
        JSONObject json = new JSONObject();
        json.put("name","张飞");
        json.put("domicile","翼州涿郡");
        json.put("age",23);
        return json.toString();
    }
}