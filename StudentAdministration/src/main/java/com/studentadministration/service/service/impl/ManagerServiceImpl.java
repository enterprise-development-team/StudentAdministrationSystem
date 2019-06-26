package com.studentadministration.service.service.impl;

import com.studentadministration.dao.ManagerDao;
import com.studentadministration.model.entity.ManagerEntity;
import com.studentadministration.service.ManagerService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class ManagerServiceImpl implements ManagerService {
    private ManagerDao managerDao;

    public void setManagerDao(ManagerDao managerDao){
        this.managerDao = managerDao;
    }

    @Override
    @Transactional
    public void addManager(ManagerEntity managerEntity) {
        this.managerDao.addManager(managerEntity);
    }

    @Override
    @Transactional
    public void updateManager(ManagerEntity managerEntity) {
        this.managerDao.updateManager(managerEntity);
    }

    @Override
    @Transactional
    public List<ManagerEntity> listManager() {
        return this.managerDao.listManager();
    }

    @Override
    @Transactional
    public ManagerEntity getManagerById(int id) {
        return this.managerDao.getManagerById(id);
    }

    @Override
    @Transactional
    public void removeManager(int id) {
        this.managerDao.removeManager(id);
    }
}
