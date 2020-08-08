package com.coderbyte.DAOImpl;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coderbyte.DAO.UserDAO;
import com.coderbyte.model.User;

@Repository(value = "userDAO")
@Transactional
public class UserDAOImpl implements UserDAO
{
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean AddUser(User user) 
	{
		sessionFactory.getCurrentSession().save(user);
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean deleteUser(int userid) 
	{
		User user=new User();
		user.setUserid(userid);
		sessionFactory.getCurrentSession().delete(user);
		
		// TODO Auto-generated method stub
		return true;
	}

	public User displayUserByUsername(String username) 
	{
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from com.coderbyte.model.User where username=:username");
		return (User) query.setParameter("username", username).getResultList().get(0);
		
		
	}
	

}
