package com.example.tunehub.services;

import com.example.tunehub.entities.Users;

public interface UserService {
	
	public String addUser(Users user);
	
	public boolean emailExits(String email);

	public boolean validateUser(String email, String password);

	public String getRole(String email);

	public Users getUser(String email);

	public void updateUser(Users user);

	

	

}
