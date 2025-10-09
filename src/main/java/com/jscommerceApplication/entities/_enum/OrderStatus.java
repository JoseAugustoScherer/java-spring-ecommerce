package com.jscommerceApplication.entities._enum;

/**
 * @author José Augusto Scherer - jose.a.scherer@gmail.com
 * @file OrderStatus
 * @since 09/10/2025 - 10:11
 * --------------------
 * Options for the order status
 * --------------------
 */

public enum OrderStatus {

    WAITING_PAYMENT ( 1, "Waiting payment" ),
    PAID            ( 2, "Paid" ),
    SHIPPED         ( 3, "Shipped" ),
    DELIVERED       ( 4, "Delivered" ),
    CANCELLED       ( 5, "Canceled" );

    private int code;
    private String description;

    private OrderStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static OrderStatus fromCode(int code) {
        for (OrderStatus s : OrderStatus.values()) {
            if (s.getCode() == code) {
                return s;
            }
        }
        return null;
    }
}
