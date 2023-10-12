package com.example.labno308.task2;

import jakarta.persistence.*;

@Entity
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private GuestStatus status;

    @ManyToOne
    @JoinColumn (name="event_id")
    private Event event;


    public Guest() {
    }

    public Guest(Integer id, String name, GuestStatus status, Event event) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.event = event;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GuestStatus getStatus() {
        return status;
    }

    public void setStatus(GuestStatus status) {
        this.status = status;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
