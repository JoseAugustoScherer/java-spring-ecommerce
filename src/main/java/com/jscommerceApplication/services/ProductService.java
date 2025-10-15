package com.jscommerceApplication.services;

import com.jscommerceApplication.dto.ProductDTO;
import com.jscommerceApplication.entities.Product;
import com.jscommerceApplication.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
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
        Product product = productRepository.findById( id ).get();
        return new ProductDTO( product );
    }

    @Transactional ( readOnly = true )
    public Page<ProductDTO> findAll( Pageable pageable ) {
        Page<Product> products = productRepository.findAll( pageable );
        return products.map( x -> new ProductDTO( x ) );
    }

    @Transactional
    public ProductDTO createProduct( ProductDTO dto ) {
        Product product = new Product();
        copyDtoToProduct( dto, product );
        product = productRepository.save( product );
        return new ProductDTO( product );
    }

    @Transactional
    public ProductDTO updateProduct( Long id, ProductDTO dto ) {
        Product product = productRepository.getReferenceById( id );
        copyDtoToProduct( dto, product );
        product = productRepository.save( product );
        return new ProductDTO( product );
    }

    @Transactional
    public void deleteProduct( Long id ) {
        productRepository.deleteById( id );
    }

    private void copyDtoToProduct( ProductDTO dto, Product product ) {
        product.setName         ( dto.getName() );
        product.setDescription  ( dto.getDescription() );
        product.setPrice        ( dto.getPrice() );
        product.setImgUrl       ( dto.getImgUrl() );
    }

}
