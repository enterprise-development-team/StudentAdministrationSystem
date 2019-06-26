package com.studentadministration.service.service.impl;

import com.studentadministration.dao.InstituteDao;
import com.studentadministration.model.entity.InstituteEntity;
import com.studentadministration.service.InstituteService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class InstituteServiceImpl implements InstituteService {
    private InstituteDao instituteDao;

    public void setInstituteDao(InstituteDao instituteDao){
        this.instituteDao = instituteDao;
    }
    @Override
    @Transactional
    public void addInstitute(InstituteEntity instituteEntity) {
        this.instituteDao.addInstitute(instituteEntity);
    }

    @Override
    @Transactional
    public void updateInstitute(InstituteEntity instituteEntity) {
        this.instituteDao.updateInstitute(instituteEntity);
    }

    @Override
    @Transactional
    public List<InstituteEntity> listInstitute() {
        return this.instituteDao.listInstitute();
    }

    @Override
    @Transactional
    public InstituteEntity getInstituteById(int id) {
        return instituteDao.getInstituteById(id);
    }

    @Override
    @Transactional
    public void removeInstitute(int id) {
        this.instituteDao.removeInstitute(id);
    }
}
