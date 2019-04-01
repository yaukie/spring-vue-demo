package org.yaukie.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaukie.dao.UserDao;
import org.yaukie.model.Result;
import org.yaukie.model.User;
import org.yaukie.service.UserService;

@Service("userService")
public class UserServiceImpl  implements UserService {

	@Autowired
	private UserDao  userDao;
	
	public Result login(User user) {
		
		Result result = new Result();
		
		User a = userDao.login(user);
		
		if(a  !=null ){
			
			result.setCode(0);
		    result.setUser(a);
		    result.setMsg("登录成功!");
			
		}else {
			result.setCode(-1);
		    result.setMsg("登录失败!");
		}
		
		return result;
	}
		
}
