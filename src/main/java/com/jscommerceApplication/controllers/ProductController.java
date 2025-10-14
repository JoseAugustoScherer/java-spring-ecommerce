package com.jscommerceApplication.controllers;

import com.jscommerceApplication.dto.ProductDTO;
import com.jscommerceApplication.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
    public ProductDTO teste( @PathVariable Long id ) {
        return service.findById( id );
    }

}
