package com.example.demoexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping("user")
	public UserBean getUser() {
		UserBean userBean=new UserBean();
		userBean.setFirstName("Ch");
		userBean.setLastName("Satay");
		userBean.setAge(35);
		return userBean;
		
	}

}
