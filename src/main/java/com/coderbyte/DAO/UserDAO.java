package com.coderbyte.DAO;

import java.util.List;

import com.coderbyte.model.User;

public interface UserDAO 
{
	public boolean AddUser(User user);
	public boolean deleteUser(int userid);
	public User displayUserByUsername(String username);
	public boolean Updateuser(User user);
	

}
