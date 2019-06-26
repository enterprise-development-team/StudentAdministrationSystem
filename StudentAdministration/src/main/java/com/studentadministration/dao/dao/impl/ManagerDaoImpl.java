package com.studentadministration.dao.dao.impl;

import com.studentadministration.dao.ManagerDao;
import com.studentadministration.model.entity.ManagerEntity;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ManagerDaoImpl implements ManagerDao {
    private SessionFactory sessionFactory;

    @Override
    public void addManager(ManagerEntity managerEntity){
            Configuration cfg = new Configuration();
            cfg.configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();

            session.persist(managerEntity);

            tx.commit();
            session.close();
            sessionFactory.close();
        }

        @Override
        public void updateManager(ManagerEntity managerEntity){
            Configuration cfg = new Configuration();
            cfg.configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();

            session.update(managerEntity);

            tx.commit();
            session.close();
            sessionFactory.close();
        }

        @Override
        public List<ManagerEntity> listManager(){
            List<ManagerEntity> list = null;
            Configuration cfg = new Configuration();
            cfg.configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();

            SQLQuery qQLQuery =session.createSQLQuery("select * from manager");
            list = qQLQuery.list();

            tx.commit();
            session.close();
            sessionFactory.close();
            return list;
        }

        @Override
        public ManagerEntity getManagerById(int id){
            Configuration cfg = new Configuration();
            cfg.configure().buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();

            ManagerEntity man=session.get(ManagerEntity.class,id);

            tx.commit();
            session.close();
            sessionFactory.close();
            return man;
        }

    @Override
    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void removeManager(int id) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        ManagerEntity managerEntity = session.get(ManagerEntity.class, id);
        session.delete(managerEntity);

        tx.commit();
        session.close();
        sessionFactory.close();

    }
}
