package com.coderbyte.ServiceDAOImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderbyte.DAO.GoalDAO;
import com.coderbyte.ServiceDAO.GoalServiceDAO;
import com.coderbyte.model.Goal;
@Service
public class GoalServiceDAOImpl implements GoalServiceDAO
{

	@Autowired
	GoalDAO goalDAO;
	@Override
	public boolean AddGoal(Goal goal) {
		goalDAO.AddGoal(goal);
		return true;
	}

	@Override
	public boolean UpdateGoal(Goal goal) {
		goalDAO.UpdateGoal(goal);
		return true;
	}

	@Override
	public boolean DeleteGoal(int goalid) {
		goalDAO.DeleteGoal(goalid);
		return true;
	}

	@Override
	public List<Goal> DisplayGoals() {
		// TODO Auto-generated method stub
		return goalDAO.DisplayGoals();
	}
	

}
