package com.fadil.tugashrd.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer loginId;
    private String username;
    private String password;
    private String status;
    private String token;

    @OneToOne
    private Hrd hrd;
}
