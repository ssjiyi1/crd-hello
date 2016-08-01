package cn.zw.controller;

import cn.zw.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
public class StudentController {


    @Autowired
    private StudentService studentService;

    @RequestMapping("/say")
    @ResponseBody
    public  String say(){
        studentService.say();
        return "hello";
    }


    @RequestMapping("/index")
    public  String index(){
        return "index";
    }

}
