package com.org.service;

import java.util.List;

import com.org.model.Employee;
import com.org.model.LoginBean;

/**
 * @author Dinesh Rajput
 *
 */
public interface UserService {
	public LoginBean ValidateUser(LoginBean loginBean);
	
}
