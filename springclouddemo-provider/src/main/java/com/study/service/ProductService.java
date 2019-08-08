package com.study.service;

import com.study.pojo.Product;

import java.util.List;

public interface ProductService {
    Product get(Integer id);

    List<Product> list();
}
