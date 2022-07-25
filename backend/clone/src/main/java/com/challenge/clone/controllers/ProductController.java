package com.challenge.clone.controllers;

import com.challenge.clone.dto.ProductDto;
import com.challenge.clone.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(path = "/products")
    public List<ProductDto> getProducts(){
        return this.productService.getProducts();
    }

    @GetMapping(path = "/{id}")
    public ProductDto getProduct(@PathVariable("id") Long id){
        return this.productService.getProductById(id);
    }

}
