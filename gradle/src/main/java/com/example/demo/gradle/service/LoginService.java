package com.example.demo.gradle.service;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.gradle.model.LoginBean;
import com.example.demo.gradle.repository.CustomRepository;
import com.example.demo.gradle.repository.ExtendedRepository;
import com.example.demo.gradle.repository.LoginRepositoryInterface;

//@Component ("loginBean")
@Service
public class LoginService {
	
	@Autowired
	//ExtendedRepository loginRepo;
	CustomRepository loginRepo;
	
	public boolean validateUser(String user, String pass) {
		//List<LoginBean> findAll = loginRepo.findAll();
		//System.out.println(findAll);
		boolean usernameBoolean = findByUsernameService(user);
		boolean passwordBoolean = findByPasswordService(pass);		
		return usernameBoolean && passwordBoolean;
    }
	
	public boolean findByPasswordService(String password) {
/*		Query q = entityManager.createNativeQuery("SELECT a.id, a.username, a.password FROM mydb.login a where a.password LIKE ?", LoginBean.class);
        q.setParameter(1,password);
        List<LoginBean> authors = q.getResultList();
*/        
       List<LoginBean> authors = (List<LoginBean>) loginRepo.findByPassword(password);
        
        String p1 = "";
        for (LoginBean a : authors) {
        	p1 = a.getPassword();
        }
        System.out.println(p1.equals(password));
        System.out.println("password is "+p1);
        return p1.equals(password);
	}
	
	
	public boolean findByUsernameService(String username) {
		/*		Query q = entityManager.createNativeQuery("SELECT a.id, a.username, a.password FROM mydb.login a where a.password LIKE ?", LoginBean.class);
		        q.setParameter(1,password);
		        List<LoginBean> authors = q.getResultList();
		*/        
		       List<LoginBean> authors = (List<LoginBean>) loginRepo.findByPassword(username);
		        
		        String p1 = "";
		        for (LoginBean a : authors) {
		        	p1 = a.getPassword();
		        }
		        System.out.println(p1.equals(username));
		        System.out.println("username is "+p1);
		        return p1.equals(username);
			}
	
}
