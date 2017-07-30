package com.manish.java.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.manish.java.model.UserDetail;
import com.manish.java.model.UserDetails;

@RestController
@RequestMapping(value = "/rest")
public class HelloController {

	@RequestMapping(value = "/users")
	public @ResponseBody UserDetails getAllUser() {
		System.out.println("pathVariable called");
		UserDetails userDetails = new UserDetails();
		UserDetail user1 = new UserDetail("Manish1", "Srivastava");
		UserDetail user2 = new UserDetail("Manish2", "Srivastava");
		UserDetail user3 = new UserDetail("Manish3", "Srivastava");
		userDetails.getuserDetail().add(user1);
		userDetails.getuserDetail().add(user2);
		userDetails.getuserDetail().add(user3);
		return userDetails;
	}

	@RequestMapping(value = "/user/{id}")
	@ResponseBody
	public ResponseEntity<UserDetail> getUser(@PathVariable("id") int id) {
		if (id <= 3) {
			UserDetail user1 = new UserDetail("Manish1", "Srivastava");
			return new ResponseEntity<UserDetail>(user1, HttpStatus.OK);
		}
		return new ResponseEntity<UserDetail>(HttpStatus.NOT_FOUND);
	}
}