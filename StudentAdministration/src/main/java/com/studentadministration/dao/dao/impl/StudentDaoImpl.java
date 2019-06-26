package com.studentadministration.dao.dao.impl;

import com.studentadministration.dao.StudentDao;
import com.studentadministration.model.entity.StudentEntity;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private SessionFactory sessionFactory;

    @Override
    public void addStudent(StudentEntity studentEntity) {
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(studentEntity);

        tx.commit();
        session.close();
        sessionFactory.close();
    }

    @Override
    public void updateStudent(StudentEntity studentEntity) {
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.update(studentEntity);

        tx.commit();
        session.close();
        sessionFactory.close();
    }

    @Override
    public List<StudentEntity> listStudent() {
        List<StudentEntity> list = null;
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        SQLQuery qQLQuery = session.createSQLQuery("select * from Student");
        list = qQLQuery.list();

        tx.commit();
        session.close();
        sessionFactory.close();
        return list;
    }

    @Override
    public void removeStudent(int id) {
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        StudentEntity stu = session.get(StudentEntity.class, id);
        session.delete(stu);

        tx.commit();
        session.close();
        sessionFactory.close();
    }
    @Override
    public StudentEntity getStudentById(int id) {
        Configuration cfg = new Configuration();
        cfg.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        StudentEntity studentEntity = session.get(StudentEntity.class, id);

        tx.commit();
        session.close();
        sessionFactory.close();
        return studentEntity;
    }

    @Override
    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }
}
