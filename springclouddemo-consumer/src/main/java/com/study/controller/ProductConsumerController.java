package com.study.controller;

import com.study.pojo.Product;
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

    public static final String PRODUCT_GET_URL = "http://SPRINGCLOUDDEMO-PROVIDER/product/get/";
    public static final String PRODUCT_LIST_URL = "http://SPRINGCLOUDDEMO-PROVIDER/product/list";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private HttpHeaders httpHeaders;

    @RequestMapping("/product/get")
    public Object getProduct(long id) {
        Product product = restTemplate.exchange(PRODUCT_GET_URL + id, HttpMethod.GET,
                new HttpEntity<Object>(httpHeaders), Product.class).getBody();
        return product;
    }

    @RequestMapping("/product/list")
    public Object listProduct() {
        List<Product> list = restTemplate.exchange(PRODUCT_LIST_URL, HttpMethod.GET,
                new HttpEntity<Object>(httpHeaders), List.class).getBody();
        return list;
    }

}
