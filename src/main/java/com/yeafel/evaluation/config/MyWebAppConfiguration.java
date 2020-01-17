package com.yeafel.evaluation.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created by thc on 2019/9/21 2:13
 */
//@Configuration
@Controller
public class MyWebAppConfiguration /*extends WebMvcConfigurationSupport*/ {

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        /**
//         * @Description: 对文件的路径进行配置,创建一个虚拟路径/Path/** ，即只要在<img src="/Path/picName.jpg" />便可以直接引用图片
//         *这是图片的物理路径  "file:/+本地图片的地址"
//         * @Date： Create in 14:08 2019/9/20                                    //
//         */
//        registry.addResourceHandler("/**").addResourceLocations("file:/E:/Users/zhk/IdeaProjects/evaluation/src/main/resources/static/");
//        super.addResourceHandlers(registry);
//    }
    /**
     * 重定向登录页面
     */
    @GetMapping("/")
    public String login(){
        return "redirect:/login.html";
    }
}