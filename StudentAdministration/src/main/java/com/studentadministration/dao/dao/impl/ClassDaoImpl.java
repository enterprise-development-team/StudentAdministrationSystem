package com.studentadministration.dao.dao.impl;

import com.studentadministration.dao.ClassDao;
import com.studentadministration.model.entity.ClassEntity;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ClassDaoImpl implements ClassDao {
    private SessionFactory sessionFactory;

    @Override
    public void addClass(ClassEntity classEntity){
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(classEntity);

        tx.commit();
        session.close();
        sessionFactory.close();
    }

    @Override
    public void updateClass(ClassEntity c){
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(c);

        tx.commit();
        session.close();
        sessionFactory.close();
    }

    @Override
    public List<ClassEntity> listClass(){
        List<ClassEntity> list = null;
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        SQLQuery qQLQuery =session.createSQLQuery("select * from class");
        list = qQLQuery.list();
        tx.commit();

        session.close();
        sessionFactory.close();
        return list;
    }

    @Override
    public ClassEntity getClassById(int id){
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        ClassEntity classEntity=session.get(ClassEntity.class,id);
        tx.commit();

        session.close();
        sessionFactory.close();
        return classEntity;
    }

    @Override
    public void removeClass(int id){
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        ClassEntity classEntity=session.get(ClassEntity.class,id);
        session.delete(classEntity);

        tx.commit();
        session.close();
        sessionFactory.close();
    }

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }
}
