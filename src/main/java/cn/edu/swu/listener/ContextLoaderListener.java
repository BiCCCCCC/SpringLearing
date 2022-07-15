package cn.edu.swu.listener;

import cn.edu.swu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //读取web.xml中全局参数
        ServletContext servletContext = sce.getServletContext();

        ApplicationContext app = new ClassPathXmlApplicationContext(servletContext.getInitParameter("contextConfigLocation"));
        //将spring应用上下文对象存储到ServletContext域中
        servletContext.setAttribute("app", app);
        System.out.println("spring容器创建完毕");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
