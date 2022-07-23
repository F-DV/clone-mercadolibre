package com.challenge.clone.daoimpl;

import com.challenge.clone.dao.ProductDao;
import com.challenge.clone.entities.ProductEntity;
import com.challenge.clone.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductMySqlDaoImpl implements ProductDao {


    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<ProductEntity> getProducts() {

        return this.productRepository.findAll();
    }


    @Override
    public ProductEntity findbyId(Long id) {
        return this.productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());
    }
}
