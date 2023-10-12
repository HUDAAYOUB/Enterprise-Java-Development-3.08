package com.example.labno308.task1;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Association {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "association")
    private List<Chapter> chapters;


    public Association(Integer id, List<Chapter> chapters) {
        this.id = id;
        this.chapters = chapters;
    }

    public Association() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }
}
