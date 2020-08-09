package com.coderbyte.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coderbyte.DAO.GoalDAO;
import com.coderbyte.model.Goal;
@Repository(value = "goalDAO")
@Transactional
public class GoalDAOImpl implements GoalDAO
{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean AddGoal(Goal goal) {
		sessionFactory.getCurrentSession().save(goal);
		return true;
	}

	@Override
	public boolean UpdateGoal(Goal goal) {
		sessionFactory.getCurrentSession().update(goal);
		return true;
	}

	@Override
	public boolean DeleteGoal(int goalid) {
		Goal goal=new Goal();
		goal.setGoalID(goalid);
		sessionFactory.getCurrentSession().delete(goal);
		return true;
		
	}

	@Override
	public List<Goal> DisplayGoals() 
	{
		return sessionFactory.getCurrentSession().createQuery("from com.coderbyte.model.Goal").getResultList();	
	}
	

}
