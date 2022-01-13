package com.yjxxt.webinit;

import com.yjxxt.config.WebConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;


public class WebInit implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext app
                = new AnnotationConfigWebApplicationContext();
        //注册mvc配置信息
        app.register(WebConfig.class);
        //设置上下文信息
        app.setServletContext(servletContext);
        //配置转发器
        ServletRegistration.Dynamic servlet
                = servletContext.addServlet("dispatcher", new DispatcherServlet(app));
        //设置映射路径
        servlet.addMapping("/");
        //饿汉式
        servlet.setLoadOnStartup(1);

    }
}
