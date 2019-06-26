package com.studentadministration.dao.dao.impl;

import com.studentadministration.dao.CourseDao;
import com.studentadministration.model.entity.CourseEntity;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CourseDaoImpl implements CourseDao {
    private SessionFactory sessionFactory;

    @Override
    public void addCourse(CourseEntity courseEntity) {
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(courseEntity);

        tx.commit();
        session.close();
        sessionFactory.close();
    }

    @Override
    public void updateCourse(CourseEntity courseEntity) {
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.update(courseEntity);

        tx.commit();
        session.close();
        sessionFactory.close();
    }

    @Override
    public List<CourseEntity> listCourse() {
        List<CourseEntity> list = null;
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        SQLQuery qQLQuery = session.createSQLQuery("select * from Course");
        list = qQLQuery.list();

        tx.commit();
        session.close();
        sessionFactory.close();
        return list;
    }

    @Override
    public CourseEntity getCourseById(int id) {
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        CourseEntity courseEntity = session.get(CourseEntity.class, id);

        tx.commit();
        session.close();
        sessionFactory.close();
        return courseEntity;
    }

    @Override
    public void removeCourse(int id) {
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        CourseEntity courseEntity = session.get(CourseEntity.class, id);
        session.delete(courseEntity);

        tx.commit();
        session.close();
        sessionFactory.close();
    }

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }
}
