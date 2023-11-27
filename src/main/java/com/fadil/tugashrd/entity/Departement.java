package com.fadil.tugashrd.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Departement {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer departementId;
    private String nameDepartement;
}
