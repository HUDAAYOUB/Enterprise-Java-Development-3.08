package com.example.labno308.task2;

import jakarta.persistence.*;

@Entity
public class Speaker {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer presentationDuration;

    @ManyToOne
    @JoinColumn(name="conference_id")
    private Conference conference;




}
