package com.studentadministration.dao;

import com.studentadministration.model.entity.EnrollEntity;
import org.hibernate.SessionFactory;

import java.util.List;

public interface EnrollDao {
    public void addEnroll(EnrollEntity enrollEntity);

    public void updateEnroll(EnrollEntity enrollEntity);

    public List<EnrollEntity> listEnroll();

    public void getEnrollById(int id);

    public void setSessionFactory(SessionFactory sf);
}
