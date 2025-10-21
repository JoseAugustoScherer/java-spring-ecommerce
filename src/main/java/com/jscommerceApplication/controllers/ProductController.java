package com.jscommerceApplication.controllers;

import com.jscommerceApplication.dto.ProductDTO;
import com.jscommerceApplication.services.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


/**
 * @author José Augusto Scherer - jose.a.scherer@gmail.com
 * @file ProductController
 * @since 14/10/2025 - 16:33
 * --------------------
 * Define os endpoints de /products
 * --------------------
 */

@RestController
@RequestMapping ( value = "/products" )
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping ( value = "/{id}")
    public ResponseEntity<ProductDTO> findById(@PathVariable Long id ) {
        ProductDTO dto = service.findById( id );
        return ResponseEntity.ok( dto );
    }

    @GetMapping
    public ResponseEntity<Page<ProductDTO>> findAll( Pageable pageable ) {
        Page<ProductDTO> dto = service.findAll( pageable );
        return ResponseEntity.ok( dto );
    }

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct( @Valid @RequestBody ProductDTO productDTO ) {
        productDTO = service.createProduct( productDTO );
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path( "/{id}").buildAndExpand( productDTO.getId() ).toUri();
        return ResponseEntity.created( uri ).body( productDTO );
    }

    @PutMapping ( value = "/{id}")
    public ResponseEntity<ProductDTO> updateProduct(@PathVariable Long id, @Valid @RequestBody ProductDTO productDTO  ) {
        productDTO = service.updateProduct( id, productDTO );
        return ResponseEntity.ok( productDTO );
    }

    @DeleteMapping ( value = "/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id ) {
        service.deleteProduct( id );
        return ResponseEntity.noContent().build();
    }

}
