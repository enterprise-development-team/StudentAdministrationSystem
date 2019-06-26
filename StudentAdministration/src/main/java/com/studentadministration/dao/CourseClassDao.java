package com.studentadministration.dao;

import com.studentadministration.model.entity.CourseClassEntity;
import org.hibernate.SessionFactory;

import java.util.List;

public interface CourseClassDao {
    public void addCourseClass(CourseClassEntity classEntity);

    public void updateCourseClass(CourseClassEntity c);

    public List<CourseClassEntity> listCourseClass();

    public CourseClassEntity getCourseClassById(int id);

    public void setSessionFactory(SessionFactory sf);

    public void removeCourseClass(int id);
}
