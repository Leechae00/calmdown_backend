package com.example.calmdown.entity;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String phone;

    @Column
    private String emergency_phone;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private LocalDate birth;
}
