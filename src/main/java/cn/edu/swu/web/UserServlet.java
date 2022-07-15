package cn.edu.swu.web;


import cn.edu.swu.service.UserService;
import cn.edu.swu.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());
        ApplicationContext app= WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());
        UserService service = app.getBean(UserService.class);
        service.save();
    }
}
