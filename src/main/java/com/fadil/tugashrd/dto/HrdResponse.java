package com.fadil.tugashrd.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class HrdResponse {
    private Integer hrdId;
    private String nameHrd;
    private String email;
    private String phone;
    private String username;
    private String password;
}
