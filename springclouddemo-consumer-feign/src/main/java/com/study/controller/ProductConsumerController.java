package com.study.controller;

import com.study.pojo.Product;
import com.study.service.IProductClientService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ProductConsumerController {

    @Resource
    private IProductClientService iProductClientService;

    @RequestMapping("/product/get")
    public Object getProduct(long id) {
        Product product = iProductClientService.getProduct(id);
        return product;
    }

    @RequestMapping("/product/list")
    public Object listProduct() {
        List<Product> list = iProductClientService.listProduct();
        return list;
    }

}
