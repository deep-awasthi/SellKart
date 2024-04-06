package com.deepawasthi.cart.Entity;


import java.util.UUID;

public class ProductEntity {
    public UUID productID;
    public String name;
    public double price;
    public double rating;
    public String imageURL;

    public ProductEntity() {
    }

    public ProductEntity(UUID productID, String name, double price, double rating, String imageURL) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.imageURL = imageURL;
    }

    public UUID getProductID() {
        return productID;
    }

    public void setProductID(UUID productID) {
        this.productID = productID;
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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
