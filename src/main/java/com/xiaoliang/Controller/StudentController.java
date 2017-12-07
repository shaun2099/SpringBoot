package com.xiaoliang.Controller;

import com.xiaoliang.Entity.Student;
import com.xiaoliang.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getStudents() {
        return this.studentService.getStudents();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Student getStudentById(@PathVariable("id") int id){
        return this.studentService.getStudentById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteStudentById(@PathVariable("id") int id){
        this.studentService.removeStudentById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@RequestBody Student student){
        this.studentService.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody Student student){
        this.studentService.insertStudent(student);
    }
}
