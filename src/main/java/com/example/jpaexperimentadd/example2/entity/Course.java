package com.example.jpaexperimentadd.example2.entity;

import com.example.jpaexperimentadd.example2.relationship.Elective;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String name;
    @OneToMany(mappedBy = "course")
    private List<Elective> electives;
    public Course(String name){
        this.name=name;
    }
}
