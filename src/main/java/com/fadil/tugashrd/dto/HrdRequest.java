package com.fadil.tugashrd.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class HrdRequest {
    @NotBlank(message =  "tolong masukan nama")
    private String nameHrd;
    @NotBlank(message =  "tolong masukan nama")
    private String email;
    @NotBlank(message =  "tolong masukan nama")
    private String phone;
    @NotBlank(message =  "tolong masukan nama")
    private String username;
    @NotBlank(message =  "tolong masukan nama")
    private String password;

}
