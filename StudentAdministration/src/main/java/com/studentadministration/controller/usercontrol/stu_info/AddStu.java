package com.studentadministration.controller.usercontrol.stu_info;


import com.studentadministration.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AddStu {
    @Autowired
    StudentService studentService;
    @RequestMapping(value="/test",method={RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String Test(){
        System.out.println("asfsadfsadfsda");
        return "success";
    }

}
