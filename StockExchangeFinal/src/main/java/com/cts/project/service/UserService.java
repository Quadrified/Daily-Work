package com.cts.project.service;

import java.util.List;

import com.cts.project.dto.UserDTO;

public interface UserService {
	
	public UserDTO insert(UserDTO userDTO);
	
	public void remove(int id);
	
	public UserDTO update(UserDTO userDTO);
	
	public UserDTO getById(int id);
	
	public List<UserDTO> getAll();
	
	public UserDTO getUserByCode(long code);
	
}
