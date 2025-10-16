package com.jscommerceApplication.services.exceptions;

/**
 * @author José Augusto Scherer - jose.a.scherer@gmail.com
 * @file ResourceNotFoundException
 * @since 15/10/2025 - 16:12
 * --------------------
 * [ BRIEF DESCRIPTION OF THE CLASS PURPOSE GOES HERE ]
 * --------------------
 */
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException( String message ) {
        super( message );
    }
}
