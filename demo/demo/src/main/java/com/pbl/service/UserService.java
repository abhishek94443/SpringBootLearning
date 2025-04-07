package com.pbl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.pbl.dao.UserDao;
import com.pbl.model.Users;
@Service
public class UserService {
	@Autowired
	AuthenticationManager authManager;
	
	@Autowired
	JWTService jwtService;
	private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(10);
	@Autowired
	UserDao dao;
	public Users registerUser(Users user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return dao.registerUser(user);
	}
	
	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		return dao.getUsers();
	}

	public String verify(Users user) {
		// TODO Auto-generated method stub
		Authentication authentication=authManager
				.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));
		if(authentication.isAuthenticated())return jwtService.generateToken(user.getUsername());
		return "fail";
	}

	
}
