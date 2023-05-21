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

    @Column
    private String title;

    @Column
    private String memo;

    @Column
    private LocalDate daytime;

    @Column
    //발작강도 기록
    private int seizure_intensity;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;



}
