package com.example.jparelations.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Town {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String zipcode;
    private String mayor;
    private int schools;

    public Town(String name, String zipcode, String mayor, int schools) {
        this.name = name;
        this.zipcode = zipcode;
        this.mayor = mayor;
        this.schools = schools;
    }
}
