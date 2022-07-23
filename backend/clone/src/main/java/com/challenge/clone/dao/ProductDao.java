package com.challenge.clone.dao;

import com.challenge.clone.entities.ProductEntity;

import java.util.List;

public interface ProductDao {

    List<ProductEntity> getProducts();
    ProductEntity findbyId(Long id);
}
