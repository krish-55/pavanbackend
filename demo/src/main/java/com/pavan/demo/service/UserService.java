package com.pavan.demo.service;

import java.util.List;

import com.pavan.demo.entity.Users;

public interface UserService {
	
	
	public Users saveUser(Users user);
	public Users updateUser(int id ,Users user);
	public Users getUserById(int id);
	public void deleteUser(int id);
	public List <Users> findAllUsers();

}