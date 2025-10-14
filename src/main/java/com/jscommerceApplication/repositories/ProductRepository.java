package com.jscommerceApplication.repositories;

import com.jscommerceApplication.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

;

/**
 * @author José Augusto Scherer - jose.a.scherer@gmail.com
 * @file ProductRepository
 * @since 14/10/2025 - 16:42
 * --------------------
 * Data base operations
 * --------------------
 */

public interface ProductRepository extends JpaRepository<Product, Long> {
}
