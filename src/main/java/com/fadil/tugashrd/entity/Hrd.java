package com.fadil.tugashrd.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Hrd {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer hrdId;
    private String nameHrd;
    private String email;
    private String phone;
    private String username;
    private String password;


}
