package com.study.controller;

import com.study.pojo.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ProductConsumerController {

    public static final String PRODUCT_GET_URL = "http://localhost:8081/product/get/";
    public static final String PRODUCT_LIST_URL="http://localhost:8081/product/list";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/product/get")
    public Object getProduct(long id) {
        Product product = restTemplate.getForObject(PRODUCT_GET_URL + id, Product.class);
        return  product;
    }

    @RequestMapping("/product/list")
    public  Object listProduct() {
        List<Product> list = restTemplate.getForObject(PRODUCT_LIST_URL,List.class);
        return  list;
    }

}
