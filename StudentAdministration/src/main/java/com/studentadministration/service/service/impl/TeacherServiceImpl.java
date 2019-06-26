package com.studentadministration.service.service.impl;

import com.studentadministration.dao.TeacherDao;
import com.studentadministration.model.entity.TeacherEntity;
import com.studentadministration.service.TeacherService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {
    private TeacherDao teacherDao;

    public void setTeacherDao(TeacherDao teacherDao){
        this.teacherDao = teacherDao;
    }
    @Override
    @Transactional
    public void addTeacher(TeacherEntity teacherEntity) {
        this.teacherDao.addTeacher(teacherEntity);
    }

    @Override
    public void updateTeacher(TeacherEntity teacherEntity) {
        this.updateTeacher(teacherEntity);
    }

    @Override
    public List<TeacherEntity> listTeacher() {
        return this.teacherDao.listTeacher();
    }

    @Override
    public TeacherEntity getTeacherById(int id) {
        return teacherDao.getTeacherById(id);
    }

    @Override
    public void removeTeacher(int id) {
        this.teacherDao.removeTeacher(id);
    }
}
