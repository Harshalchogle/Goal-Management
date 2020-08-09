package com.coderbyte.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.coderbyte.ServiceDAO.GoalServiceDAO;
import com.coderbyte.ServiceDAOImpl.GoalServiceDAOImpl;
import com.coderbyte.config.AppConfig;
import com.coderbyte.model.Goal;
@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = AppConfig.class)
public class GoalTest 
{
	@Autowired
	GoalServiceDAO goalServiceDAO;

	@Test
	public void AddGoal()
	{
		Goal goal=new Goal();
		goal.setGoalName("Buying Phone");
		goal.setMicrosavings(200);
		goal.setnTransactions(4);
		goal.settAmount(10000);
		assertEquals(true, goalServiceDAO.AddGoal(goal));
	}
}
