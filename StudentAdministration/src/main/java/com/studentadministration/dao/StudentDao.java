package com.studentadministration.dao;

import com.studentadministration.model.entity.StudentEntity;
import org.hibernate.SessionFactory;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentDao{
    public void addStudent(StudentEntity studentEntity);

    public void updateStudent(StudentEntity studentEntity);

    public List<StudentEntity> listStudent();

    public StudentEntity getStudentById(int id);

    public void setSessionFactory(SessionFactory sf);

    public void removeStudent(int id);
}
