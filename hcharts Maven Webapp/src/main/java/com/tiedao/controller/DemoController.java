package com.tiedao.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tiedao.pojo.Demo;
import com.tiedao.service.DemoService;

@Controller
@RequestMapping("/demo")
public class DemoController {
	@Resource
	private DemoService demoService;
	
	@RequestMapping("/showDemo")
	public String toIndex(HttpServletRequest request,Model model){
		int demoId = Integer.parseInt(request.getParameter("id"));
		Demo demo = this.demoService.getDemoById(demoId);
		model.addAttribute("demo", demo);
		return "showdemo";
	}
	
	@RequestMapping("/all")
	public ModelAndView all(){
		ModelAndView view = new ModelAndView();
		List<Demo> list;
		try{
			list = demoService.selectAll();
			view.addObject("demo",list);
			view.setViewName("demo.jsp");
		}catch(Exception e){
			view.addObject("error",e.getMessage());
			view.setViewName("error.jsp");
		}
		return view;
	}

}
