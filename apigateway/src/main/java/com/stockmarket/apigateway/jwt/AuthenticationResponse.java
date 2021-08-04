package com.stockmarket.apigateway.jwt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class AuthenticationResponse {
    private String username;
    private Boolean admin;
    private String jwt;
}