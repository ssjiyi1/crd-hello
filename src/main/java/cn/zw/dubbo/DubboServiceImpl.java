package cn.zw.dubbo;

import cn.zw.dubbo.dao.DubboService;
import cn.zw.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator
 * on 2016/5/31
 * 11:31.
 */
public class DubboServiceImpl implements DubboService {

    @Autowired
    private StudentService studentService;

    @Override
    public Integer add(int num1, int num2) {
        System.out.println("<-------------------" + studentService + "---------------->");
        return num1 + num2;
    }
}
