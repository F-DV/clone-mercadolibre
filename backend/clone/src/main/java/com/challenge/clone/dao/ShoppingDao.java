package com.challenge.clone.dao;

import com.challenge.clone.entities.ShoppingEntity;

import java.util.List;
import java.util.Optional;

public interface ShoppingDao {
    List<ShoppingEntity> getShopping();
    ShoppingEntity findById(Long id);
}
