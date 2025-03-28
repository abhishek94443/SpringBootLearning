package com.abhishek.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.binding.User;

@RestController
public class UserRestController {
	private Map<Integer, User> map=new HashMap<>();
	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody User user){
		System.out.println(user);
		map.put(user.getId(), user);
		System.out.println(map.get(user.getId()));
		return new ResponseEntity<String>("user saved", HttpStatus.OK);
		
	}
	@GetMapping("/user/{id}/data")
	public User getUser(@PathVariable ("id") Integer userid) {
		User user=map.get(userid);
		return user;
	}
//	@GetMapping("/user")
//	public User getUser(@RequestParam("userid") Integer userid) {
//		User user=map.get(userid);
//		return user;
//	}

}
