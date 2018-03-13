package com.tiedao.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tiedao.pojo.User;
import com.tiedao.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
	
	///////////////以下是自己加上去的///////////////////////
	/* @RequestMapping(value="/login")
     public String login(@Param("username") String username,@Param("password") String password,HttpServletRequest request) {
        User user=userService.checkLogin(username, password);
         if(user!=null){
             HttpSession session=request.getSession();
             session.setAttribute("user",user);
             return "redirect:/user/home";// 路径 WEB-INF/pages/welcome.jsp            
         }
         request.setAttribute("error", "用户名或密码错误");
         return "error";
     }

     @RequestMapping("registerpage")
     public String registerpage() {

       return "register";

     }

     @RequestMapping("home")
     public String home() {
       
    	 return "home";

     }

     @RequestMapping("register")
     public String register(User user,HttpServletRequest requsest) {
       if(userService.checkRegisterUsername(user.getUsername()))
           {
           return "home";
           }
       return "error";

     }*/
	  //登录功能的实现
	  @RequestMapping(value="/login",method=RequestMethod.POST)
	    public String login(User user,Model model) throws Exception {
	        user=userService.checkLogin(user.getName(), user.getPassword());
	        if(user!=null){
	            model.addAttribute(user);
	            return "success";// 路径 WEB-INF/pages/success.jsp            
	        }
	        return "error";
	    }
	////////////////自主创新结束/////////////////////
}