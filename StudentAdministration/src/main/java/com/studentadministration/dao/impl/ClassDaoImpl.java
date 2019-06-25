package com.studentadministration.dao.impl;

import com.studentadministration.model.entity.ClassEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ClassDaoImpl {
    private SessionFactory sessionFactory;


    public void addClass(ClassEntity classEntity){
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(classEntity);
    }

    public void updateClass(ClassEntity c){
        Session session = this.sessionFactory.getCurrentSession();
        session.update(c);
    }

    //public List<Class>
    public void getClassById(int id){

    }

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }
}
