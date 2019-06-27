package com.studentadministration.dao.dao.impl;

import com.studentadministration.dao.InstituteDao;
import com.studentadministration.model.entity.InstituteEntity;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class InstituteDaoImpl implements InstituteDao {
    private SessionFactory sessionFactory;

    public void addInstitute(InstituteEntity instituteEntity) {
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(instituteEntity);

        tx.commit();
        session.close();
        sessionFactory.close();
    }

    public void updateInstitute(InstituteEntity instituteEntity) {
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.update(instituteEntity);

        tx.commit();
        session.close();
        sessionFactory.close();
    }

    public List<InstituteEntity> listInstitute() {
        List<InstituteEntity> list = null;
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        SQLQuery qQLQuery =session.createSQLQuery("select * from Institute");
        list = qQLQuery.list();

        tx.commit();
        session.close();
        sessionFactory.close();
        return list;
    }

    public InstituteEntity getInstituteById(int id) {
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        InstituteEntity instituteEntity=session.get(InstituteEntity.class,id);
        tx.commit();

        session.close();
        sessionFactory.close();
        return instituteEntity;
    }

    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void removeInstitute(int id) {
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        InstituteEntity instituteEntity = session.get(InstituteEntity.class, id);
        session.delete(instituteEntity);

        tx.commit();
        session.close();
        sessionFactory.close();
    }
}
