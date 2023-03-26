
package com.hatisha.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("home")
//	@ResponseBody
	public String home(@RequestParam("myname") String name,HttpSession session ){
//		HttpSession session=req.getSession();
//		String name=req.getParameter("name");
		
		System.out.println("hii "+name);
		session.setAttribute("name", name);
		return "home";
		
	}

}
