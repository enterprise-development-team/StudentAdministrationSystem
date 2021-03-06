package com.studentadministration.dao;

import com.studentadministration.model.entity.CourseEntity;
import org.hibernate.SessionFactory;

import java.util.List;

public interface CourseDao {
    public void addCourse(CourseEntity courseEntity);

    public void updateCourse(CourseEntity courseEntity);

    public List<CourseEntity> listCourse();

    public CourseEntity getCourseById(int id);

    public void setSessionFactory(SessionFactory sf);

    public void removeCourse(int id);
}
