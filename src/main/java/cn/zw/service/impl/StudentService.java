package cn.zw.service.impl;

import cn.zw.dao.StudentDao;
import cn.zw.entity.Student;
import cn.zw.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator
 * on 2016/5/30
 * 18:00.
 */
@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentDao studentDao;

    public  void insertStudent(Student student){
        studentDao.insert(student);
    }

    public List<Student> findAll(){
        return  studentDao.findAllStudent();
    }

    @Override
    public Student selectOne(Long id) {
        return null;
    }


}
