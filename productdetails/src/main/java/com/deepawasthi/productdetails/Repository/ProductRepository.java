package com.deepawasthi.productdetails.Repository;

import com.deepawasthi.productdetails.Entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends MongoRepository<ProductEntity, UUID> {
}
