package org.yaukie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yaukie.model.Result;
import org.yaukie.model.User;
import org.yaukie.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService ;
	
	@ResponseBody
	@PostMapping("/login")
	public Result login (@RequestBody User user ){
		return userService.login(user);
	}
	
}
