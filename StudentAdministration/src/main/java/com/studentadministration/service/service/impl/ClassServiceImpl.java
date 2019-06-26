package com.studentadministration.service.service.impl;

import com.studentadministration.dao.ClassDao;
import com.studentadministration.model.entity.ClassEntity;
import com.studentadministration.service.ClassService;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class ClassServiceImpl implements ClassService {

    private ClassDao classDao;

    public void setClassDao(ClassDao classDao){
        this.classDao = classDao;
    }

    @Override
    @Transactional
    public void addClass(ClassEntity classEntity) {
        this.classDao.addClass(classEntity);
    }

    @Override
    @Transactional
    public void updateClass(ClassEntity classEntity) {
        this.classDao.updateClass(classEntity);
    }

    @Override
    @Transactional
    public List<ClassEntity> listClass() {
        return this.classDao.listClass();
    }

    @Override
    @Transactional
    public ClassEntity getClassById(int id) {
        return this.classDao.getClassById(id);
    }

    @Override
    public void removeClass(int id) {
        this.classDao.removeClass(id);
    }


}
