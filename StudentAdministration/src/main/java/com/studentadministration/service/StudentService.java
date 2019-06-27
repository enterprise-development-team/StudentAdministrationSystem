package com.studentadministration.service;

import com.studentadministration.model.entity.StudentEntity;
import java.util.List;

public interface StudentService {
    public void addStudent(StudentEntity studentEntity);

    public void updateStudent(StudentEntity studentEntity);

    public List<StudentEntity> listStudent();

    public StudentEntity getStudentById(int id);

    public void removeStudent(int id);
}
