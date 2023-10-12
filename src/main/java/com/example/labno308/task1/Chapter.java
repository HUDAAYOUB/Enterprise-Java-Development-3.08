package com.example.labno308.task1;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String district;

    @ManyToOne
    @JoinColumn(name="president_id")
    private Member president;


    //    Use only if we want a bidirectional relationship
//    If used, we must be careful not to create a stackOverflow Error (infinite loop)
//    @OneToMany(mappedBy = "teacher")
//    List<Course> courses;

    @OneToMany(mappedBy = "chapter")
    private List<Member> Member ;

    @ManyToOne
    @JoinColumn(name="association_id")
    private Association association;

    public Chapter() {
    }

    public Chapter(Integer id, String name, String district, Member president, ArrayList<Member> member) {
        this.id = id;
        this.name = name;
        this.district = district;
        this.president = president;
        Member = member;
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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<com.example.labno308.task1.Member> getMember() {
        return Member;
    }

    public void setMember(List<com.example.labno308.task1.Member> member) {
        Member = member;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }
}
