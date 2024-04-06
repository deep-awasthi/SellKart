package com.deepawasthi.productdetails.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


@Document
public class ProductEntity {

    @Id
    private UUID productId;
    private String name;
    private double price;
    private double rating;
    private String productImageUrl;

    public ProductEntity() {
    }

    public ProductEntity(UUID productId, String name, double price, double rating, String productImageUrl) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.productImageUrl = productImageUrl;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }
}
