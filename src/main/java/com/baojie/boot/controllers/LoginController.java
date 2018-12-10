package com.baojie.boot.controllers;


import com.baojie.boot.jpa.entity.User;
import com.baojie.boot.jpa.repos.BookRepo;
import com.baojie.boot.jpa.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    private final BookRepo bookRepo;
    private final UserRepo userRepo;

    @Autowired
    public LoginController(BookRepo book,UserRepo user) {
        if (null == book||null==user) {
            throw new NullPointerException();
        } else {
            this.bookRepo = book;
            this.userRepo=user;
        }
    }

    //index页面
    @RequestMapping(value = "/front/index")
    public String index() {
        return "index";
    }

    //注册页面
    @RequestMapping(value = "/front/register")
    public String register(){
        return "register";
    }

    //登录页面
    @RequestMapping(value = "/front/login")
    public String login(){
        return "login";
    }

    //注册方法
    @RequestMapping(value = "/front/addregister")
    public String register(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");
        if (password.equals(password2)){
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            userRepo.save(user);
            return "login";
        }else {
            return "register";
        }
    }

    //登录方法
    @RequestMapping(value = "/front/addlogin")
    public String login(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User userEntity = userRepo.findByUsernameAndPassword(username,password);
        String str = "";
        if (userEntity !=null){
            str = "index";
        }else {
            str = "login";
        }
        return str;
    }


}
