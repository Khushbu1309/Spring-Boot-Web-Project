
package com.hatisha.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("home")
//	@ResponseBody
	public ModelAndView home(Student student){
//		HttpSession session=req.getSession();
//		String name=req.getParameter("name");
		
		System.out.println("hii ");
//		session.setAttribute("name", name);
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("obj", student);
		
		mv.setViewName("home");
		return mv;
		
	}

}
