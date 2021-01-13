package com.UseCase.controller;

import com.UseCase.Service.StudentService;
import com.UseCase.dao.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("")
public class AddController {


        @Autowired
        private StudentService service;

        @RequestMapping("/")
        public String home(){
            System.out.println("test");
            return "WEB-INF/jsp/onboard";
        }

        @RequestMapping(value = "/user/onboard",method = RequestMethod.POST)
        public String OnboardUser(@RequestParam() String email,@RequestParam() String first,@RequestParam() String last,
                                  @RequestParam() String password)
        {
            /*ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("email",info.getEmail());
            modelAndView.addObject("first",info.getFirstName());
            modelAndView.addObject("last",info.getLastName());
            modelAndView.addObject("password",info.getPassword());

            modelAndView.setViewName("result.jsp");*/

            StudentInfo studentInfo=new StudentInfo();
             studentInfo.setFirstName(first);
            studentInfo.setLastName(last);
            studentInfo.setEmail(email);
            studentInfo.setPassword(password);

            System.out.println("ksdahkdsahdkashdkhsakdhsakkasdhksahd");
           service.addInfo(studentInfo);


            //service.onBoard(1,email,first,last,password);
            return "WEB-INF/jsp/onboard";
        }

        @RequestMapping("/user/login")
        public String loginUser(HttpServletRequest req,HttpServletRequest res)
        {
           // String email = req.getParameter("email");
           // String password=req.getParameter("pass");
            //System.out.println(email+" "+password);
            return "WEB-INF/jsp/login";

        }

        @RequestMapping("/courses/view")
        public String viewCourses(){
            return "WEB-INF/jsp/viewCourse";
        }

        @RequestMapping("/user/course/register")
        public String registerCourse(){
            return "WEB-INF/jsp/register";
        }

        @RequestMapping("/user/options")
        public String UserOptions(){
            return "WEB-INF/jsp/CourseOptions";
        }

    @ExceptionHandler
    @ResponseBody
    public void handleAll(Exception e){
     //   logger.error("Error ", e);
       // logger.error("API Request Error :{}", e.getMessage());
        e.printStackTrace();

    }

}