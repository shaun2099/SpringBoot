package com.xiaoliang.Dao;

import com.xiaoliang.Entity.Student;

import java.util.Collection;

public interface IStudentDao {
    Collection<Student> getStudents();

    Student getStudentById(int id);

    void removeStudentByid(int id);

    void updateStudent(Student st);

    void insertStudent(Student student);
}
