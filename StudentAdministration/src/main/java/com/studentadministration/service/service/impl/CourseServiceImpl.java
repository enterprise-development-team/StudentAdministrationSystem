package com.studentadministration.service.service.impl;

import com.studentadministration.dao.CourseDao;
import com.studentadministration.model.entity.CourseEntity;
import com.studentadministration.service.CourseService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CourseServiceImpl implements CourseService {

    private CourseDao courseDao;

    public void setCourseDao(CourseDao courseDao){
        this.courseDao = courseDao;
    }

    @Override
    @Transactional
    public void addCourse(CourseEntity courseEntity) {
        this.courseDao.addCourse(courseEntity);
    }

    @Override
    @Transactional
    public void updateCourse(CourseEntity courseEntity) {
        this.courseDao.updateCourse(courseEntity);

    }

    @Override
    @Transactional
    public List<CourseEntity> listCourse() {
        return this.courseDao.listCourse();
    }

    @Override
    @Transactional
    public CourseEntity getCourseById(int id) {
        return this.courseDao.getCourseById(id);
    }

    @Override
    @Transactional
    public void removeCourse(int id) {
        this.courseDao.removeCourse(id);
    }
}
