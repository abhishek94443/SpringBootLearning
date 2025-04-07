package com.pbl.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pbl.model.Users;


@Repository
public class UserDao {
	private List<Users> users=new ArrayList<>(
		List.of(new Users(1, "abhi", "abhi", "USER"),
			new Users(2, "ravi", "ravi", "ADMIN"),
			new Users(3, "kavi", "kavi", "SME")
			));

	public Users findByUsername(String username) {
		// TODO Auto-generated method stub
		for(Users u:users) {
			if(u.getUsername().equals(username)) {
				return u;
			}
		}
		return null;
	}
	public Users registerUser(Users user) {
		users.add(user);
		return user;
	}
	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		return users;
	}
	public boolean verify(Users user) {
		// TODO Auto-generated method stub
		for(Users u:users) {
			System.out.println(u.getUsername()+"  "+user.getUsername()+" "+ u.getPassword()+"  "+user.getPassword());
			if(u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())) {
				return true;
			}
		}
		
		
		return false;
	}

	
	
	
}
