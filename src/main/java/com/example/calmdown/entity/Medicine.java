package com.example.calmdown.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;

@Getter
@Entity
@Table(name = "medicine")
@NoArgsConstructor
@AllArgsConstructor
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int dosing;

    @Column
    private LocalTime time;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
