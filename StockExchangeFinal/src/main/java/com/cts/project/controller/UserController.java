package com.cts.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.bean.User;
import com.cts.project.dto.UserDTO;
import com.cts.project.repo.UserRepo;
import com.cts.project.service.UserService;

@CrossOrigin(origins="*")
@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/user")
	public ResponseEntity<?> getAllUsers(){
		List<UserDTO> userDTOs=userService.getAll();
		if(userDTOs.size()>0) {
			return new ResponseEntity<List<UserDTO>>(userDTOs,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("No User Found",HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<?> getUserById(@PathVariable int id) {
		UserDTO userDTO=userService.getById(id);
		if(userDTO!=null) {
			return new ResponseEntity<UserDTO>(userDTO,HttpStatus.OK);
		}else{
			return new ResponseEntity<String>("User Not Found",HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/user")
	public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO userDTO) {
//		User u=userRepo.save(user);
		userService.insert(userDTO);
		return new ResponseEntity<UserDTO>(userDTO,HttpStatus.OK);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable int id) {
		userService.remove(id);
	}
	
	@PutMapping("/user")
	public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO) {
//		User u=userRepo.save(user);
		userService.update(userDTO);
		return new ResponseEntity<UserDTO>(userDTO,HttpStatus.OK);
	}
	
	@GetMapping("/user/activate/{code}")
	public ResponseEntity<?> getUserByCode(@PathVariable long code) {
		UserDTO userDTO=userService.getUserByCode(code);
		if(userDTO!=null) {
			return new ResponseEntity<UserDTO>(userDTO,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("User Not Found",HttpStatus.NOT_FOUND);
		}
	}

}
