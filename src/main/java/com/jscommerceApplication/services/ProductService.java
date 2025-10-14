package com.jscommerceApplication.services;

import com.jscommerceApplication.dto.ProductDTO;
import com.jscommerceApplication.entities.Product;
import com.jscommerceApplication.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author José Augusto Scherer - jose.a.scherer@gmail.com
 * @file ProductService
 * @since 14/10/2025 - 17:06
 * --------------------
 * Defines business rules
 * --------------------
 */

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional ( readOnly = true )
    public ProductDTO findById( Long id ) {
        Optional<Product> result = productRepository.findById( id );
        Product product = result.get();
        ProductDTO productDTO = new ProductDTO( product );
        return productDTO;
    }

}
