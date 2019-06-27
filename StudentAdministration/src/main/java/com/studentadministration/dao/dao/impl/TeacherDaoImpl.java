package com.studentadministration.dao.dao.impl;

import com.studentadministration.dao.TeacherDao;
import com.studentadministration.model.entity.TeacherEntity;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class TeacherDaoImpl implements TeacherDao {
    private SessionFactory sessionFactory;

    @Override
    public void addTeacher(TeacherEntity teacherEntity){
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(teacherEntity);

        tx.commit();
        session.close();
        sessionFactory.close();
    }

    @Override
    public void updateTeacher(TeacherEntity teacherEntity){
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();
        session.update(teacherEntity);

        tx.commit();
        session.close();
        sessionFactory.close();
    }

    @Override
    public List<TeacherEntity> listTeacher(){
        List<TeacherEntity> list = null;
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        SQLQuery qQLQuery =session.createSQLQuery("select * from teacher");
        list = qQLQuery.list();

        tx.commit();
        session.close();
        sessionFactory.close();
        return list;
    }

    @Override
    public TeacherEntity getTeacherById(int id){
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        TeacherEntity tea=session.get(TeacherEntity.class,id);

        tx.commit();
        session.close();
        sessionFactory.close();
        return tea;
    }

    @Override
    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void removeTeacher(int id) {
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        TeacherEntity teacherEntity = session.get(TeacherEntity.class, id);
        session.delete(teacherEntity);

        tx.commit();
        session.close();
        sessionFactory.close();
    }
}
