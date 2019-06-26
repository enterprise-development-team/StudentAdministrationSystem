package com.studentadministration.service;

import com.studentadministration.model.entity.CourseClassEntity;
import java.util.List;

public interface CourseClassService {
    public void addCourseClass(CourseClassEntity courseClassEntity);

    public void updateCourseClass(CourseClassEntity courseClassEntity);

    public List<CourseClassEntity> listCourseClass();

    public CourseClassEntity getCourseClassById(int id);

    public void removeCourseClass(int id);
}
