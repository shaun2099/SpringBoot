package com.xiaoliang.Service;

import com.xiaoliang.Dao.IStudentDao;
import com.xiaoliang.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
    @Autowired
    @Qualifier("mongoData")
    private IStudentDao studentDao;

    public Collection<Student> getStudents() {
        return this.studentDao.getStudents();
    }

    public Student getStudentById(int id){
        return this.studentDao.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDao.removeStudentByid(id);
    }

    public void updateStudent(Student st) {
        this.studentDao.updateStudent(st);
    }

    public void insertStudent(Student student) {
        this.studentDao.insertStudent(student);
    }
}
