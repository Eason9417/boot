package com.baiyun.boot.controller;

import com.baiyun.boot.pojo.Student;
import com.baiyun.boot.service.StudentService;
import com.baiyun.boot.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;


@Controller
public class MainController {

    @Autowired
    private DateUtil dateUtil;
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = {"/main"})
    public String maintpage(HttpSession session){
        Object id = session.getAttribute("studentId");
        if(id == null){
            return "login";
        }else {int i = Integer.parseInt(id.toString());
            Student student = studentService.getById(i);
            session.setAttribute("studentName",student.getStudentName());
            session.setAttribute("studentSchool",student.getSchool());
            session.setAttribute("studentGender",student.getGender());
            session.setAttribute("studentNationality",student.getNationality());
            session.setAttribute("studentPoliticsStatus",student.getPoliticsStatus());
            session.setAttribute("studentBirthday",dateUtil.YearMonDayData(student.getBirthday()));
            session.setAttribute("studentMajor",student.getMajor());
            session.setAttribute("studentAdmissionDate",dateUtil.YearMonDayData(student.getAdmissionDate()));
            session.setAttribute("systemTime",dateUtil.NowDate());

            return "main";
        }
    }

    @GetMapping("/signout")
    public String signout(HttpSession session){
        session.removeAttribute("studentId");
        return "redirect:login.html";
    }

    @GetMapping("/personal")
    public String personal(){
        return "student-personal";
    }
}
