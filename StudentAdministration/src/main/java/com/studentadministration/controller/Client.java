package com.studentadministration.controller;

import com.studentadministration.model.ClassBean;
import com.studentadministration.model.DBUtil;
import com.studentadministration.model.OptCourseBean;
import com.studentadministration.model.Permission;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ControllerConfig.class);

        ClassBean classBean = context.getBean("ClassBean",ClassBean.class);
        System.out.println("新建Bean对象:"+classBean);
        DBUtil dbUtil = context.getBean("DBUtil",DBUtil.class);
        System.out.println("新建Bean对象:"+dbUtil);
        OptCourseBean optcourseBean = context.getBean("OptCourseBean",OptCourseBean.class);
        System.out.println("新建Bean对象:"+optcourseBean);
        Permission perBean = context.getBean("Permission", Permission.class);
        System.out.println("新建Bean对象:"+perBean);



        SessionFactory sessionFactory = new Configuration().configure()
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();


        session.close();
    }
}
