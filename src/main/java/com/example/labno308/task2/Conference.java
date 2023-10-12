package com.example.labno308.task2;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Conference extends Event{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "conference")
    List<Speaker> speakers;


}
