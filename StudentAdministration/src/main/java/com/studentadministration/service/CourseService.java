package com.studentadministration.service;

import com.studentadministration.model.entity.CourseEntity;
import java.util.List;

public interface CourseService {
    public void addCourse(CourseEntity courseEntity);

    public void updateCourse(CourseEntity courseEntity);

    public List<CourseEntity> listCourse();

    public CourseEntity getCourseById(int id);

    public void removeCourse(int id);
}
