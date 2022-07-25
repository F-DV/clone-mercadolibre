package com.challenge.clone.repositories;

import com.challenge.clone.entities.ShoppingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingRepository extends JpaRepository<ShoppingEntity,Long> {
}
