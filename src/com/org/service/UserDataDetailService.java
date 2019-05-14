package com.org.service;


import java.sql.Blob;
import java.util.List;

import com.org.model.LoginBean;
import com.org.model.UserDetail;

public interface UserDataDetailService {

	
	public void addUserDetail(UserDetail userdetail);
	public List<UserDetail> getUser(UserDetail userdetail);
	public List<UserDetail> getUser();
	public void update(int parameter);
	public void deleteByID(String parameter);
	public byte[] getUserdetailasByID(int id);
	//public Object getUser(LoginBean loginBeanPersistance);
	public Object getUserByName(String userName);

}
