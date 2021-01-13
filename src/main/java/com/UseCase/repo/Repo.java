package com.UseCase.repo;

import com.UseCase.dao.StudentInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;


@Component
@Repository
public class Repo {

        @Autowired
        @Qualifier("hibernate4AnnotatedSessionFactory")
        private SessionFactory sessionFactory;

        public void setSessionFactory(SessionFactory sf) {
                this.sessionFactory = sf;
        }



        public void save(StudentInfo p) {
                Session session = this.sessionFactory.getCurrentSession();
                session.persist(p);
        }
}

     //   Configuration con=new Configuration().configure().addAnnotatedClass(StudentInfo.class);
       // SessionFactory sf=con.buildSessionFactory();
       // Session session = sf.openSession();
        //Transaction tx=session.beginTransaction();




/*
@Repository
public interface Repo extends JpaRepository<StudentInfo, String> {

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "insert into StudenInfo (StudentID,email,firstName,LastName,password) values (?1,?2,?3,?4,?5)")
    public void onBoard(int StudentID, String email,String firstName,String LastName,String password);



 */






