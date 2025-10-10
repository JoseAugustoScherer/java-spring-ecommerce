package com.jscommerceApplication.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author José Augusto Scherer - jose.a.scherer@gmail.com
 * @file Category
 * @since 09/10/2025 - 15:18
 * --------------------
 * This class define de 'Category Object'
 * --------------------
 */

@Entity
@Table ( name = "tb_category")
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;
    private String name;

    @ManyToMany ( mappedBy = "categories")
    private Set<Product> products = new HashSet<>();

    public Category() {
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }
}
