package com.example.demo.gradle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.gradle.model.LoginBean;
import com.example.demo.gradle.repository.ExtendedRepository;
import com.example.demo.gradle.repository.LoginRepositoryInterface;

//@Component ("loginBean")
@Service
public class LoginService {
	
	@Autowired
	ExtendedRepository loginRepo;
	
	public boolean validateUser(String user, String pass) {
		//List<LoginBean> findAll = loginRepo.findAll();
		//System.out.println(findAll);
		boolean usernameBoolean = loginRepo.findByUsername(user);
		boolean passwordBoolean = loginRepo.findByPassword(pass);		
		return usernameBoolean && passwordBoolean;
    }
	
}
