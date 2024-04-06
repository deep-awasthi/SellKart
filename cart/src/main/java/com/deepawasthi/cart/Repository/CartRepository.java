package com.deepawasthi.cart.Repository;

import com.deepawasthi.cart.Entity.CartEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CartRepository extends CrudRepository<CartEntity, Long> {
    List<CartEntity> findByuserId(UUID userId);
}
