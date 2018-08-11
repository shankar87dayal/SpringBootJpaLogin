package com.example.demo.gradle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.gradle.model.LoginBean;
import com.example.demo.gradle.repository.CustomRepository;

@Service
public class LoginService {

	@Autowired
	// ExtendedRepository loginRepo;
	CustomRepository loginRepo;

	public boolean validateUser(String user, String pass) {

		// return loginRepo.findByUsernamePassword(user, pass);
		return findByUsernamePassword(user, pass);
	}

	public boolean findByUsernamePassword(String username, String password) {

		LoginBean findDetail = loginRepo.findByUsername(username);
		
		String u1 = findDetail.getUsername();
		String p1 = findDetail.getPassword();

		System.out.println("DB username is " + u1);
		System.out.println("DB Password is " + p1);
		
		System.out.println("Screen username is " + username);
		System.out.println("Screen Password is " + password);

		boolean usernameBoolean = u1.equalsIgnoreCase(username);
		boolean passwordBoolean = p1.equals(password);
		
		return usernameBoolean && passwordBoolean;

	}

}
