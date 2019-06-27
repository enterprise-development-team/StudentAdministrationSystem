package com.studentadministration.service.service.impl;

import com.studentadministration.dao.EnrollDao;
import com.studentadministration.model.entity.EnrollEntity;
import com.studentadministration.service.EnrollService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class EnrollServiceImpl implements EnrollService {

    private EnrollDao enrollDao;

    public void setEnrollDao(EnrollDao enrollDao){
        this.enrollDao = enrollDao;
    }

    @Override
    @Transactional
    public void addEnroll(EnrollEntity enrollEntity) {
        this.enrollDao.addEnroll(enrollEntity);
    }

    @Override
    @Transactional
    public void updateEnroll(EnrollEntity enrollEntity) {
        this.enrollDao.updateEnroll(enrollEntity);
    }

    @Override
    @Transactional
    public List<EnrollEntity> listEnroll() {
        return this.enrollDao.listEnroll();
    }

    @Override
    @Transactional
    public EnrollEntity getEnrollById(int id) {
        return enrollDao.getEnrollById(id);
    }

    @Override
    @Transactional
    public void removeEnroll(int id) {
        enrollDao.removeEnroll(id);
    }
}
