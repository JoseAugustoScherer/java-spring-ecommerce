package com.jscommerceApplication.entities;

import jakarta.persistence.*;

import java.io.Serializable;

/**
 * @author José Augusto Scherer - jose.a.scherer@gmail.com
 * @file OrderItem
 * @since 10/10/2025 - 11:38
 * --------------------
 * This class define de 'OrderItem Object'
 * --------------------
 * --------------------
 * Reference documentation:
 *  <br>
 * This class is an association between orders and products, storing them for retrospective queries such as checking
 * which order was placed on date X and what the price of the product was a few months ago.
 * --------------------
 */

@Entity
@Table ( name = "tb_order_item" )
public class OrderItem {

    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();

    private Integer quantity;
    private Double price;

    public OrderItem() {
    }

    public OrderItem(Order order, Product product, Integer quantity, Double price) {
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    public Order getOrder() {
        return id.getOrder();
    }

    public void setOrder(Order order){
        id.setOrder(order);
    }

    public Product getProduct() {
        return id.getProduct();
    }

    public void setProduct(Product product) {
        id.setProduct(product);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
