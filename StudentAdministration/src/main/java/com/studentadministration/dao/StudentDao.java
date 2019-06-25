package com.studentadministration.dao;

import com.studentadministration.model.entity.StudentEntity;
import org.hibernate.SessionFactory;

import java.util.List;

public interface StudentDao {
    public void addStudent(StudentEntity studentEntity);

    public void updateStudent(StudentEntity studentEntity);

    public List<StudentEntity> listStudent();

    public void getStudentById(int id);

    public void setSessionFactory(SessionFactory sf);
}
