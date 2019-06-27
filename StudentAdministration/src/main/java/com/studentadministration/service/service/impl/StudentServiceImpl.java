package com.studentadministration.service.service.impl;

import com.studentadministration.dao.StudentDao;
import com.studentadministration.model.entity.StudentEntity;
import com.studentadministration.service.StudentService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao){
        this.studentDao = studentDao;
    }
    @Override
    @Transactional
    public void addStudent(StudentEntity studentEntity) {
        studentDao.addStudent(studentEntity);
    }

    @Override
    @Transactional
    public void updateStudent(StudentEntity studentEntity) {
        this.studentDao.updateStudent(studentEntity);
    }

    @Override
    @Transactional
    public List<StudentEntity> listStudent() {
        return this.studentDao.listStudent();
    }

    @Override
    @Transactional
    public StudentEntity getStudentById(int id) {
        return this.studentDao.getStudentById(id);
    }

    @Override
    @Transactional
    public void removeStudent(int id) {
        this.studentDao.removeStudent(id);
    }
}
