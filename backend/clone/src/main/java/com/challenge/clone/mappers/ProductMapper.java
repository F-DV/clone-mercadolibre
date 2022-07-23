package com.challenge.clone.mappers;

import com.challenge.clone.dto.ProductDto;
import com.challenge.clone.entities.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface ProductMapper {

    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "name", source = "name"),
            @Mapping(target = "price", source = "price"),
            @Mapping(target = "stock", source = "stock"),
    })
    ProductDto productEntityToProducDto(ProductEntity productEntity);

    @InheritInverseConfiguration
    ProductEntity ProductDtoToProductEntity(ProductDto productDto);
}
