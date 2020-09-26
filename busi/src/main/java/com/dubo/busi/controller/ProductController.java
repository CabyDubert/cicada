package com.dubo.busi.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dubo.busi.entity.Product;
import com.dubo.busi.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/list")
    public List<Product> list() {
        return productService.list();
    }

    @PostMapping("/query")
    public List<Product> query(@RequestBody String body) {
        JSONObject json = JSON.parseObject(body);
        Product entity = new Product();
        entity.setSkuId(json.getString("skuId"));
        entity.setBarCode(json.getString("barCode"));
        entity.setName(json.getString("name"));
        return productService.list();
    }

    @PostMapping("/add")
    public int add(@RequestBody String body) {
        Product entity = JSON.parseObject(body, Product.class);
        return productService.insert(entity);
    }

    @PatchMapping("/update")
    public void update(@RequestBody String body) {
        productService.update(body);
    }
}
