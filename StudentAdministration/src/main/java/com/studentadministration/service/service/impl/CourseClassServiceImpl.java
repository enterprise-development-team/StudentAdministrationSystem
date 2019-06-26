package com.studentadministration.service.service.impl;

import com.studentadministration.dao.CourseClassDao;
import com.studentadministration.model.entity.CourseClassEntity;
import com.studentadministration.service.CourseClassService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CourseClassServiceImpl implements CourseClassService {

    private CourseClassDao courseClassDao;

    public void setCourseClassDao(CourseClassDao courseClassDao){
        this.courseClassDao = courseClassDao;
    }
    @Override
    @Transactional
    public void addCourseClass(CourseClassEntity courseClassEntity) {
        this.courseClassDao.addCourseClass(courseClassEntity);
    }

    @Override
    @Transactional
    public void updateCourseClass(CourseClassEntity courseClassEntity) {
        this.courseClassDao.updateCourseClass(courseClassEntity);
    }

    @Override
    @Transactional
    public List<CourseClassEntity> listCourseClass() {
        return this.courseClassDao.listCourseClass();
    }

    @Override
    @Transactional
    public CourseClassEntity getCourseClassById(int id) {
        return courseClassDao.getCourseClassById(id);
    }

    @Override
    @Transactional
    public void removeCourseClass(int id) {
        courseClassDao.removeCourseClass(id);
    }
}
