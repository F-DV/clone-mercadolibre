package com.challenge.clone.daoimpl;

import com.challenge.clone.dao.ShoppingDao;
import com.challenge.clone.entities.ShoppingEntity;
import com.challenge.clone.repositories.ShoppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ShoppingMySqlDaoImpl implements ShoppingDao {

    @Autowired
    private ShoppingRepository shoppingRepository;

    @Override
    public List<ShoppingEntity> getShopping() {
        return this.shoppingRepository.findAll();
    }

    @Override
    public ShoppingEntity findById(Long id) {
        return this.shoppingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());
    }

}
