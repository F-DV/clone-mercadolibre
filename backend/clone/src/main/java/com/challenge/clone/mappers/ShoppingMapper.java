package com.challenge.clone.mappers;

import com.challenge.clone.dto.ShoppingDto;
import com.challenge.clone.entities.ShoppingEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper
public interface ShoppingMapper {

    @Mappings({
            @Mapping(target = "id", source = "id"),
            @Mapping(target = "name", source = "name"),
            @Mapping(target = "amount", source = "amount"),
            @Mapping(target = "customerName", source = "customerName"),
    })
    ShoppingDto shoppingEntityToShoppigDto(ShoppingEntity shoppingEntity);

    @InheritInverseConfiguration
    ShoppingEntity shoppingDtoToShoppingEntity(ShoppingDto shoppingDto);

}
