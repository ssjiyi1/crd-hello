package cn.zw.controller;

import cn.zw.controller.common.bean.Result;
import cn.zw.entity.Student;
import cn.zw.service.IStudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static cn.zw.controller.common.bean.ResultBuild.fail;
import static cn.zw.controller.common.bean.ResultBuild.success;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    private final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);


    @RequestMapping("/addStudent")
    @ResponseBody
    public Result addStudent(Student student) {
        try {
            studentService.insertStudent(student);
            return success(student);
        } catch (Exception e) {
            LOGGER.error("添加学生失败",e);
            return fail();
        }

    }


    @RequestMapping("/listAll")
    @ResponseBody
    public Result listAll() {
        try {
            return success(studentService.findAll());
        } catch (Exception e) {
            LOGGER.error("获取学生列表出错",e);
            return fail();
        }
    }


    @RequestMapping("/index")
    public String index() {
        return "/student/index";
    }







}
