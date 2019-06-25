package com.studentadministration.dao;

import com.studentadministration.model.entity.InstituteEntity;
import org.hibernate.SessionFactory;

import java.util.List;

public interface InstituteDao {
    public void addInstitute(InstituteEntity instituteEntity);

    public void updateInstitute(InstituteEntity instituteEntity);

    public List<InstituteEntity> listInstitute();

    public void getInstituteById(int id);

    public void setSessionFactory(SessionFactory sf);
}
