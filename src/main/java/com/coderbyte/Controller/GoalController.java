package com.coderbyte.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coderbyte.ServiceDAO.GoalServiceDAO;
import com.coderbyte.model.Goal;


@Controller
public class GoalController 
{
	@Autowired
	GoalServiceDAO goalDAO;
	@RequestMapping("/create")
	public String Create(ModelMap map)
	{
		map.addAttribute("goal",new Goal());
		return "Create";
	}
	@PostMapping("/create")
	public String created(@ModelAttribute("goal")Goal goal)
	{
		goalDAO.AddGoal(goal);
		return "redirect:/";
	}
	
	@RequestMapping("/goal")
	public String goal(ModelMap map)
	{
		map.addAttribute("goals",goalDAO.DisplayGoals());		
		return "MyGoals";
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam("goalid")int goalid)
	{
		goalDAO.DeleteGoal(goalid);
		return "redirect:/" ;
	}

}
