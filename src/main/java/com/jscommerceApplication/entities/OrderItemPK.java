package com.jscommerceApplication.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * @author José Augusto Scherer - jose.a.scherer@gmail.com
 * @file OrderItemPK
 * @since 10/10/2025 - 11:44
 * --------------------
 * Create a unique key from two unique keys.
 * --------------------
 */

@Embeddable
public class OrderItemPK {

    @ManyToOne
    @JoinColumn ( name = "order_id" )
    private Order order;

    @ManyToOne
    @JoinColumn ( name = "product_id" )
    private Product product;

    public OrderItemPK() {
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
