package com.studentadministration.dao;

import com.studentadministration.model.entity.ManagerEntity;
import org.hibernate.SessionFactory;

import java.util.List;

public interface ManagerDao {
    public void addManager(ManagerEntity managerEntity);

    public void updateManager(ManagerEntity managerEntity);

    public List<ManagerEntity> listManager();

    public ManagerEntity getManagerById(String id);

    public void setSessionFactory(SessionFactory sf);

    public void removeManager(int id);
}
