package com.challenge.clone.services;

import com.challenge.clone.dao.ProductDao;
import com.challenge.clone.dto.ProductDto;
import com.challenge.clone.entities.ProductEntity;
import com.challenge.clone.mappers.ProductMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    private ProductMapper mapper = Mappers.getMapper(ProductMapper.class);

    public List<ProductDto> getProducts(){
        List<ProductEntity> products = this.productDao.getProducts();

        return products
                .stream()
                .map(element -> mapper.productEntityToProducDto(element))
                .collect(Collectors.toList());
    }
}
