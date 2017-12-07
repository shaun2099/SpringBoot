package com.xiaoliang.Dao;

import com.xiaoliang.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("mongoData")
public class MongoStudentDaoImpl implements  IStudentDao {
    @Override
    public Collection<Student> getStudents() {
        return new ArrayList<Student>(){
            {
                add(new Student(1, "Mario", "Nothing"));
            }
        };
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentByid(int id) {

    }

    @Override
    public void updateStudent(Student st) {

    }

    @Override
    public void insertStudent(Student student) {

    }
}
