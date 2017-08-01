package com.manish.javadev.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manish.javadev.model.UserEntity;
import com.manish.javadev.service.MessengerService;

/**
 * @author Manish
 *
 */
@RestController
@RequestMapping("/messenger")
public class MessengerController {

	/* ========= Find User Detail by User Id ============= */
	@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
	public ResponseEntity<UserEntity> findUserById(@PathVariable("userId") Integer userId) {
		UserEntity userEntity = MessengerService.userInfo(userId);
		return new ResponseEntity<UserEntity>(userEntity, HttpStatus.OK);
	}

	/* ========= Find All User Detail ============= */
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public ResponseEntity<List<UserEntity>> findUsers() {
		List<UserEntity> userEntity = MessengerService.usersInfo();
		return new ResponseEntity<List<UserEntity>>(userEntity, HttpStatus.OK);
	}

	/* ========= Creating a User Detail ============= */
	@RequestMapping(value = "/user", method = RequestMethod.POST, produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userEntity) {
		UserEntity resulltUserEntity = MessengerService.createUser(userEntity);
		return new ResponseEntity<UserEntity>(resulltUserEntity, HttpStatus.OK);
	}

	/* ========= Updating User Detail by User Id ============= */
	@RequestMapping(value = "/user/{userId}", method = RequestMethod.PUT, produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE }, consumes = { MediaType.APPLICATION_XML_VALUE,
					MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UserEntity> updateUser(@PathVariable("userId") Integer userId,
			@RequestBody UserEntity userEntity) {
		UserEntity resulltUserEntity = MessengerService.updateUser(userId, userEntity);
		return new ResponseEntity<UserEntity>(resulltUserEntity, HttpStatus.OK);
	}

	/* ========= Deleting User Detail by User Id ============= */
	@RequestMapping(value = "/user/{userId}", method = RequestMethod.DELETE, produces = {
			MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }, consumes = {
					MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<UserEntity>> deletUser(@PathVariable("userId") Integer userId) {
		List<UserEntity> resulltUserEntity = MessengerService.deleteUser(userId);
		return new ResponseEntity<List<UserEntity>>(resulltUserEntity, HttpStatus.OK);
	}

}
