package com.study.service.impl;

import com.study.pojo.Product;
import com.study.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public Product get(Integer id) {
        return null;
    }

    @Override
    public List<Product> list() {

        List<Product> products = new ArrayList<>();
        Product product1 = new Product(1,"电脑","联想电脑");
        Product product2 = new Product(2,"电脑","苹果电脑");
        products.add(product1);
        products.add(product2);

        return products;
    }
}
