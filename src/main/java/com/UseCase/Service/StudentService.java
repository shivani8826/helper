package com.UseCase.Service;

import com.UseCase.dao.StudentInfo;
import com.UseCase.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class StudentService {

    @Autowired
   private Repo repo;

   @Transactional
    public void addInfo(StudentInfo studentInfo) {
       System.out.println("hiii");
        //repo.save(studentInfo);
    }





   /*
    public void onBoard(int  StudentID, String email,String firstName,String LastName,String password){
        repo.onBoard(StudentID,email,firstName,LastName,password);
    }

    */

}
