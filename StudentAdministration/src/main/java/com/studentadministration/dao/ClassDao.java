package com.studentadministration.dao;

import com.studentadministration.model.entity.ClassEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;


public interface ClassDao {

    public void addClass(ClassEntity classEntity);

    public void updateClass(ClassEntity c);

    public List<ClassEntity> listClass();

    public void getClassById(int id);

    public void setSessionFactory(SessionFactory sf);

}

