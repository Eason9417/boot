package com.baiyun.boot.controller;

import com.baiyun.boot.pojo.StudentAccount;
import com.baiyun.boot.service.StudentAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private StudentAccountService studentAccountService;

    @GetMapping(value = {"/","/login"})
    public String defaultpage(){
        return "login";
    }

    @PostMapping("/login")
    public String login(StudentAccount studentAccount, HttpSession session, Model model){
        HashMap<String, Object> map = new HashMap<>();
        map.put("StudentId",studentAccount.getStudentId());
        map.put("StudentPwd",studentAccount.getStudentPwd());
        List<StudentAccount> studentAccounts = studentAccountService.listByMap(map);
        if (studentAccounts.size() >= 1){
            int studentId = studentAccounts.get(0).getStudentId();
            session.setAttribute("studentId",studentId);
            return "redirect:main";
        }else {
            model.addAttribute("msg","账号密码错误！");
            return "login";
        }
    }


}
