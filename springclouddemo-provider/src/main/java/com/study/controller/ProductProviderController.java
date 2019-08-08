package com.study.controller;

import com.study.pojo.Product;
import com.study.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductProviderController {

    @Resource
    private ProductService productService;

    @RequestMapping("/get/{id}")
    public Object get(Integer id) {
        return this.productService.get(id);
    }

    @RequestMapping("/list")
    public Object list(){
        List<Product> productList = new ArrayList<>();
        productList = this.productService.list();
        return productList;
    }

}
