package com.studentadministration.dao.dao.impl;

import com.studentadministration.dao.EnrollDao;
import com.studentadministration.model.entity.EnrollEntity;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class EnrollDaoImpl implements EnrollDao {
    private SessionFactory sessionFactory;

    @Override
    public void addEnroll(EnrollEntity enrollEntity) {
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(enrollEntity);

        tx.commit();
        session.close();
        sessionFactory.close();
    }
    @Override
    public void updateEnroll(EnrollEntity enrollEntity) {
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.update(enrollEntity);

        tx.commit();
        session.close();
        sessionFactory.close();
    }
    @Override
    public List<EnrollEntity> listEnroll() {
        List<EnrollEntity> list = null;
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        SQLQuery qQLQuery = session.createSQLQuery("select * from Enroll");
        list = qQLQuery.list();
        tx.commit();

        session.close();
        sessionFactory.close();
        return list;
    }
    @Override
    public EnrollEntity getEnrollById(int id) {
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        EnrollEntity enrollEntity = session.get(EnrollEntity.class, id);
        tx.commit();
        session.close();
        sessionFactory.close();
        return enrollEntity;
    }

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void removeEnroll(int id) {
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        EnrollEntity enrollEntity = session.get(EnrollEntity.class, id);
        session.delete(enrollEntity);

        tx.commit();
        session.close();
        sessionFactory.close();
    }
}
