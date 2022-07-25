package com.challenge.clone.services;

import com.challenge.clone.dao.ShoppingDao;
import com.challenge.clone.dto.ShoppingDto;
import com.challenge.clone.entities.ShoppingEntity;
import com.challenge.clone.mappers.ShoppingMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ShoppingService {

    @Autowired
    private ShoppingDao shoppingDao;

    private ShoppingMapper mapper = Mappers.getMapper(ShoppingMapper.class);

    public List<ShoppingDto> getShopping(){

        List<ShoppingEntity> shoppingList = this.shoppingDao.getShopping();

        return shoppingList
                .stream()
                .map(element -> mapper.shoppingEntityToShoppigDto(element))
                .collect(Collectors.toList());
    }

    public ShoppingDto getPurchaseById(Long id){
         return mapper.shoppingEntityToShoppigDto(this.shoppingDao.findById(id));
    }
}
