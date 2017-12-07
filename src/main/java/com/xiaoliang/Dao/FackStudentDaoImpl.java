package com.xiaoliang.Dao;

import com.xiaoliang.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fakeData")
public class FackStudentDaoImpl implements IStudentDao {
    private static Map<Integer, Student> students;
    static {
        students =  new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "SHA", "Computer Science"));
                put(2, new Student(2, "Alice", "Finance"));
                put(3, new Student(3, "Anna", "Maths"));
            }
        };

    }

    @Override
    public Collection<Student> getStudents() {
        return this.students.values();
    }

    @Override
    public Student getStudentById(int id){
        return this.students.get(id);
    }

    @Override
    public void removeStudentByid(int id) {
        this.students.remove(id);
    }

    @Override
    public void updateStudent(Student st){
        Student s = students.get(st.getId());
        s.setCourse(st.getCourse());
        s.setName(st.getName());
    }

    @Override
    public void insertStudent(Student student) {
        students.put(student.getId(), student);
    }
}
