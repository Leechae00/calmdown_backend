package com.example.calmdown.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Getter
@Entity
@Table(name = "calender")
@NoArgsConstructor
@AllArgsConstructor
public class Calendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String memo;

    @Column(nullable = false)
    private LocalDate daytime;

    @Column(nullable = false)
    //발작강도 기록 1-10
    private int seizure_intensity;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;



}
