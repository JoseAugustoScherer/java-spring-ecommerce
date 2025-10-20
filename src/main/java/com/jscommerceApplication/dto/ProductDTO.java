package com.jscommerceApplication.dto;

import com.jscommerceApplication.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

/**
 * @author José Augusto Scherer - jose.a.scherer@gmail.com
 * @file ProductDTO
 * @since 14/10/2025 - 17:05
 * --------------------
 * Exposes only the necessary data to the controller
 * --------------------
 */

public class ProductDTO {

    private Long id;

    @Size ( min = 3, max = 80, message = "The name must be between 3 and 80 characters!" )
    @NotBlank ( message = "Enter the product name!" )
    private String name;

    @Size ( min = 10, message = "The description must be at least 10 characters!" )
    @NotBlank ( message = "Enter the product description!" )
    private String description;

    @Positive ( message = "Only positive values!" )
    private Double price;
    private String imgUrl;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product product) {
        id = product.getId();
        name = product.getName();
        description = product.getDescription();
        price = product.getPrice();
        imgUrl = product.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
