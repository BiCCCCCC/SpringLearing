package cn.edu.swu.controller;

import cn.edu.swu.domain.User;
import cn.edu.swu.domain.VO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserControl {

    //获取cookie
    @RequestMapping(value = "/quick20")
    @ResponseBody
    public void save20(String username, MultipartFile[] uploadFiles) throws IOException {
        System.out.println(username);
        System.out.println(uploadFiles[0].getOriginalFilename());
        File file = new File("E:\\springtmp\\" + uploadFiles[0].getOriginalFilename());
        uploadFiles[0].transferTo(file);
        System.out.println(uploadFiles[1].getOriginalFilename());
        file = new File("E:\\springtmp\\" + uploadFiles[1].getOriginalFilename());
        uploadFiles[1].transferTo(file);
    }

    //获取请求头
    @RequestMapping(value = "/quick19")
    @ResponseBody
    public void save19(@RequestHeader(value = "User-Agent") String user_agent, @CookieValue(value = "JSESSIONID") String cookie) {
        System.out.println(user_agent);
        System.out.println(cookie);
    }


    @RequestMapping(value = "/quick18")
    @ResponseBody
    public void save18(HttpServletRequest quest, HttpServletResponse response, HttpSession session) {
        System.out.println(quest);
        System.out.println(response);
        System.out.println(session);
    }

    @RequestMapping(value = "/quick17")
    @ResponseBody
    public void save17(Date date) {
        System.out.println(date);
    }


    @RequestMapping(value = "/quick16/{name}")
    @ResponseBody
    public void save16(@PathVariable("name") String username) {
        System.out.println(username);
    }

    @RequestMapping(value = "/quick15")
    @ResponseBody
    //springMVC将user转换成json字符串
    public void save15(@RequestParam(value = "name", required = false, defaultValue = "test") String username) {
        System.out.println(username);
    }


    @RequestMapping(value = "/quick14", method = RequestMethod.POST)
    @ResponseBody
    //springMVC将user转换成json字符串
    public void save14(@RequestBody List<User> userList) {
        System.out.println(userList);
    }

    @RequestMapping(value = "/quick13", method = RequestMethod.POST)
    @ResponseBody
    //springMVC将user转换成json字符串
    public void save13(VO vo) {
        System.out.println(vo);
    }


    @RequestMapping(value = "/quick12", method = RequestMethod.GET)
    @ResponseBody
    //springMVC将user转换成json字符串
    public void save12(String[] strs) {
        System.out.println(Arrays.asList(strs));
    }

    @RequestMapping(value = "/quick11", method = RequestMethod.GET)
    @ResponseBody
    //springMVC将user转换成json字符串
    public void save11(User user) throws IOException {
        System.out.println(user.getUsername());
        System.out.println(user.getAge());
    }

    @RequestMapping(value = "/quick10", method = RequestMethod.GET)
    @ResponseBody
    //springMVC将user转换成json字符串
    public void save10(String username, int age) throws IOException {
        System.out.println(username);
        System.out.println(age);
    }

    @RequestMapping(value = "/quick9", method = RequestMethod.GET)
    @ResponseBody
    //springMVC将user转换成json字符串
    public User save9() throws IOException {
        User user = new User();
        user.setUsername("bcbbcbncbc");
        user.setAge(22);
        return user;
    }

    @RequestMapping(value = "/quick8", method = RequestMethod.GET)
//    不进行页面跳转直接页面响应回显数据
    @ResponseBody
    public String save8() throws IOException {
        User user = new User();
        user.setUsername("我是大帅哥");
        user.setAge(22);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(user);
    }

    @RequestMapping(value = "/quick7", method = RequestMethod.GET)
//    不进行页面跳转直接页面响应回显数据
    @ResponseBody
    public String save7(HttpServletResponse response) throws IOException {
        return "{\"username\":\"BC\",\"age\":\"108\"}";
    }

    @RequestMapping(value = "/quick6", method = RequestMethod.GET)
    public void save6(HttpServletResponse response) throws IOException {
        response.getWriter().println("!!!!");
    }

    @RequestMapping(value = "/quick5", method = RequestMethod.GET)
    public String save5(HttpServletRequest request) {
        request.setAttribute("username", "biccccccccccsssssssssssssssscc");
        return "success";
    }

    @RequestMapping(value = "/quick4", method = RequestMethod.GET)
    public String save4(Model model) {
        model.addAttribute("username", "bicccccc");
        return "success";
    }


    @RequestMapping(value = "/quick3", method = RequestMethod.GET)
    public ModelAndView save3(ModelAndView modelAndView) {
        modelAndView.addObject("username", "bicheng");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(value = "/quick2", method = RequestMethod.GET)
    public ModelAndView save2() {
//        model封装数据
//        view展示数据
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username", "bicheng");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(value = "/quick", method = RequestMethod.GET, params = {"username"})
    public String save() {
        System.out.println("user control running");
        return "success";
    }

}
