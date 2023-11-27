package com.fadil.tugashrd.dto;

import lombok.Data;

@Data
public class TokenResponse {
    private boolean isValid;
    private String role;
}
