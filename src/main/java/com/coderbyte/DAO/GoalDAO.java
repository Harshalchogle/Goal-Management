package com.coderbyte.DAO;

import java.util.List;

import com.coderbyte.model.Goal;

public interface GoalDAO 
{
	public boolean AddGoal(Goal goal);
	public boolean UpdateGoal(Goal goal);
	public boolean DeleteGoal(int goalid);
	public List<Goal> DisplayGoals();

}
