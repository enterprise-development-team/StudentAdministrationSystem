package com.studentadministration.service;

import com.studentadministration.model.entity.TeacherEntity;
import java.util.List;

public interface TeacherService {
    public void addTeacher(TeacherEntity teacherEntity);

    public void updateTeacher(TeacherEntity teacherEntity);

    public List<TeacherEntity> listTeacher();

    public TeacherEntity getTeacherById(int id);

    public void removeTeacher(int id);
}
