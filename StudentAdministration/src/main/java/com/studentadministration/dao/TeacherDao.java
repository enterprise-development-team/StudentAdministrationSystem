package com.studentadministration.dao;

import com.studentadministration.model.entity.TeacherEntity;
import org.hibernate.SessionFactory;

import java.util.List;

public interface TeacherDao {
    public void addTeacher(TeacherEntity teacherEntity);

    public void updateTeacher(TeacherEntity teacherEntity);

    public List<TeacherEntity> listTeacher();

    public TeacherEntity getTeacherById(int id);

    public void setSessionFactory(SessionFactory sf);

    public void removeTeacher(int id);
}
