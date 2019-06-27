package com.studentadministration.controller;

import java.util.logging.Logger;

import com.studentadministration.model.entity.ManagerEntity;
import com.studentadministration.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/Login",method=RequestMethod.GET)
public class LoginAction {

    @Autowired
    //ManagerService ms;

    @RequestMapping(value="/gotoLogin",method=RequestMethod.GET)
    public String gotoLogin(){
        return "getPassword";
    }

    @RequestMapping(value="/login",method = {RequestMethod.GET,RequestMethod.POST})
    public String login(String id, String password, Model model){
        model.addAttribute("id",id);
        return "getPassword";
        /*ManagerEntity managerEntity = ms.getManagerById(id);
        String acpassword = managerEntity.getPassword();
        model.addAttribute("password",acpassword);
        System.out.println(acpassword);
        return "getPassword";
        if(acpassword.equals(password)){
            return "managemenu";
        }
        else{
            return "redirect:/index.jsp";
        }*/


    }


}
