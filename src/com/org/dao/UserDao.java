package com.org.dao;

import java.util.List;

import com.org.model.Employee;
import com.org.model.LoginBean;

/**
 * @author Dinesh Rajput
 *
 */
public interface UserDao {
	


	public LoginBean validateUser(LoginBean loginBean);
}
