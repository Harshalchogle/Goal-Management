package com.coderbyte.Controller;

import java.util.Random;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coderbyte.ServiceDAO.UserServiceDAO;
import com.coderbyte.model.User;
import com.coderbyte.others.email;

@Controller
public class RegisterController 
{
	User user;
	@Autowired
	UserServiceDAO userDAO;
	@RequestMapping("/Register")
	public String register(ModelMap map)
	{
		map.addAttribute("user",new User());
		return "register";
	}
	
	@PostMapping("/register")
	public String registered(@Valid @ModelAttribute("user")User user,Errors errors,ModelMap map)
	{
		if(errors.hasErrors())
		{
			return "register";
		}
		userDAO.AddUser(user);
		Random r=new Random();
		int random=r.nextInt(8999)+1000;
		email em=new email(user.getEmail(),"Welcome to the goal creation website","Your OTP is:"+random);
		em.sendEmail();
		map.addAttribute("otp",random);
		map.addAttribute("username",user.getUsername());
		return "OTP";
	}
	
	@PostMapping("/otp")
	public String OTP(@RequestParam("userotp")int userotp,@RequestParam("username")String username,@RequestParam("otp")int otp,ModelMap map)
	{
		user=userDAO.displayUserByUsername(username);
		user.setStatus(true);
		if(userotp==otp)
		{
			userDAO.UpdateUser(user);
			return "redirect:/login";
		}
		else
		{
			Random r=new Random();
			int random=r.nextInt(8999)+1000;
			email email=new email(user.getEmail(), "New OTP", "Your OTP is:"+random);
			email.sendEmail();
			map.addAttribute("otp", random);
			map.addAttribute("username",user.getUsername());
			return "OTP";
		}
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "Login";
	}
}
