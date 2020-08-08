package com.coderbyte.ServiceDAO;

import com.coderbyte.model.User;

public interface UserServiceDAO 
{
	public boolean AddUser(User user);
	public boolean deleteUser(int userid);
	public User displayUserByUsername(String username);

}
