package com.studentadministration.dao.dao.impl;

import com.studentadministration.dao.CourseClassDao;
import com.studentadministration.model.entity.CourseClassEntity;
import org.hibernate.SQLQuery;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CourseClassDaoImpl implements CourseClassDao {
    private SessionFactory sessionFactory;

    @Override
    public void addCourseClass(CourseClassEntity classEntity){
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
    public void updateCourseClass(CourseClassEntity c){
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
    public List<CourseClassEntity> listCourseClass(){
        List<CourseClassEntity> list = null;
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        SQLQuery qQLQuery =session.createSQLQuery("select * from courseclass");
        list = qQLQuery.list();

        tx.commit();
        session.close();
        sessionFactory.close();
        return list;
    }

    @Override
    public CourseClassEntity getCourseClassById(int id){
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        CourseClassEntity courseClassEntity=session.get(CourseClassEntity.class,id);

        tx.commit();
        session.close();
        sessionFactory.close();
        return courseClassEntity;
    }

    @Override
    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }

    @Override
    public void removeCourseClass(int id){
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        CourseClassEntity courseClassEntity=session.get(CourseClassEntity.class,id);
        session.delete(courseClassEntity);

        tx.commit();
        session.close();
        sessionFactory.close();
    }
}
