package com.example.jpaexperimentadd.example2.elective;

import com.example.jpaexperimentadd.example2.entity.Course;
import com.example.jpaexperimentadd.example2.entity.Student;
import com.example.jpaexperimentadd.example2.repository.ElectiveRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ElectiveTest {
    @Autowired
    private ElectiveRepository er;
    @Test
    public void test_elective_success(){
       Student student1=er.addStudent("Jack");
       Course course1=er.addCourse("Chinese");
       Course course2=er.addCourse("Chemistry");
       er.addElective(student1, course1);
       er.addElective(student1, course2);
    }


}
