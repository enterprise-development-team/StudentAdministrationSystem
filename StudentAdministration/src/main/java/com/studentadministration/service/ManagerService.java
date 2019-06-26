package com.studentadministration.service;

import com.studentadministration.dao.ManagerDao;
import com.studentadministration.model.entity.ManagerEntity;
import java.util.List;

public interface ManagerService {

    public void setManagerDao(ManagerDao managerDao);

    public void addManager(ManagerEntity managerEntity);

    public void updateManager(ManagerEntity managerEntity);

    public List<ManagerEntity> listManager();

    public ManagerEntity getManagerById(int id);

    public void removeManager(int id);
}
