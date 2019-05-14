package com.org.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.annotation.*;
import org.springframework.test.context.*;
import org.springframework.test.context.junit4.*;

import org.springframework.transaction.annotation.Transactional;

import com.org.dao.UserDao;
import com.org.dao.UserDetailDao;
import com.org.model.LoginBean;
import com.org.model.UserDetail;
 

 
@ContextConfiguration(locations = "classpath:sdnext-servlet.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDaoClasses
{
     
    @Autowired
    private UserDetailDao userdoa;
    
    @Autowired
    private UserDao uDAO;
     
    
     
    @Test
    @Transactional
    @Rollback(true)
    public void UserLogin()
    {
    	UserDetail userdetail = new UserDetail();
    	userdetail.setLoginBean("guest");
        
         
        List<UserDetail> userdetails = userdoa.getUser();
        Assert.assertEquals(userdetail.getLoginBean(), userdetails.get(0).getLoginBean());
    }
    
    @Test
    @Transactional
    @Rollback(true)
    public void ValidateUser()
    {
    	LoginBean logbean = new LoginBean();
    	logbean.setUserName("guest");
    	logbean.setPassword("guest123");
    	uDAO.validateUser(logbean);
         
    	LoginBean logbeans = uDAO.validateUser(logbean);
        Assert.assertEquals(logbean.getUserName(), logbeans.getUserName());
    }
    
    
   
     
    
}