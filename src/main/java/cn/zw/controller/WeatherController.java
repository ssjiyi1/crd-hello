package cn.zw.controller;

import cn.zw.controller.common.bean.Result;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import  static cn.zw.controller.common.bean.ResultBuild.*;



import java.io.IOException;

/**
 * @description 天气接口
 * @auther 'Amos'
 * @created 2016/8/22  17:44
 */
@Controller
@RequestMapping("/weather")
public class WeatherController {


    String url = "http://www.weather.com.cn/data/sk/101270101.html";


    @RequestMapping("/get")
    @ResponseBody
    public Result getWeather() {
        HttpClient httpClient = new  HttpClient();
        try {
            GetMethod get = new GetMethod(url);
            httpClient.executeMethod(get);
            return  success(new String (get.getResponseBody()));
        } catch (IOException e) {
            e.printStackTrace();
            return  fail(e.getMessage());
        }

    }

}
