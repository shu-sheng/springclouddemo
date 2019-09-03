package com.study.service;

import com.study.feign.FeignClientConfig;
import com.study.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description
 * @Date 2019-9-3 10:30
 * @Created BY WUPENG
 */
@FeignClient(name = "SPRINGCLOUDDEMO-PROVIDER-PRODUCT",configuration = FeignClientConfig.class)
public interface IProductClientService {

    @RequestMapping("/product/get/{id}")
    public Product getProduct(@PathVariable("id")long id);

    @RequestMapping("/product/list")
    public List<Product> listProduct() ;

    @RequestMapping("/product/add")
    public boolean addPorduct(Product product) ;

}
