package com.example.calmdown.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String phoneNum_Value;

    @Column
    private String EM_PhoneNum_Value;

    @Column(nullable = false)
    private String sex_Value;

    @Column(nullable = false)
    private String login_id;

    @Column(nullable = false)
    private String login_password;

    @Column(nullable = false)
    private LocalDate birth;

    public User(Long id){
        this.id = id;
    }
}
