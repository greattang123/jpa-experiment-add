package com.example.jpaexperimentadd.example2.repository;

import com.example.jpaexperimentadd.example2.entity.Course;
import com.example.jpaexperimentadd.example2.entity.Student;
import com.example.jpaexperimentadd.example2.relationship.Elective;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
@Slf4j
public class ElectiveRepository {
    @PersistenceContext
    private EntityManager em;
    public Student addStudent(String name){
        Student stu=new Student(name);
        em.persist(stu);
        return  stu;
    }
    public Course addCourse(String name){
        Course course=new Course(name);
        em.persist(course);
        return course;
    }
    public void addElective(Student student,Course course){
       Elective elective=new Elective(student,course);
       em.persist(elective);
    }
}
