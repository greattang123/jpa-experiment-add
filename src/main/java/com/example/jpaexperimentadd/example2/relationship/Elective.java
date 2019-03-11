package com.example.jpaexperimentadd.example2.relationship;

import com.example.jpaexperimentadd.example2.entity.Course;
import com.example.jpaexperimentadd.example2.entity.Student;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Elective {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Course course;
    @Column(columnDefinition = "TIMESTAMP NOT NULL "+
            "DEFAULT CURRENT_TIMESTAMP",
            updatable=false,
            insertable = false)
    private LocalDateTime selectedTime;
    private String comment;
    public Elective(Student student,Course course){
        this.student=student;
        this.course=course;
    }
}
