package com.coderbyte.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.coderbyte.DAO.UserDAO;
import com.coderbyte.ServiceDAO.UserServiceDAO;
import com.coderbyte.config.AppConfig;
import com.coderbyte.model.User;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes = AppConfig.class)
public class UserTest
{
	@Autowired
	UserServiceDAO userServiceDAO;
	@Test
	public void addUser()
	{
		User user=new User();
		user.setUserid(1);
		user.setFname("Harshal");
		user.setLname("Chogle");
		assertEquals(true, userServiceDAO.AddUser(user));
		
	}
	

}
