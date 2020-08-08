package com.coderbyte.ServiceDAOImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coderbyte.DAO.UserDAO;
import com.coderbyte.ServiceDAO.UserServiceDAO;
import com.coderbyte.model.User;
@Service
public class UserServiceDAOImpl implements UserServiceDAO
{
	@Autowired
	UserDAO userDAO;

	@Override
	public boolean AddUser(User user) 
	{
		userDAO.AddUser(user);
		return true;
	}

	@Override
	public boolean deleteUser(int userid) {
		userDAO.deleteUser(userid);
		return true;
	}

	@Override
	public User displayUserByUsername(String username) 
	{
		return userDAO.displayUserByUsername(username);
		
	}
	

}
