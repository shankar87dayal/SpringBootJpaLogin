package com.example.demo.gradle.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.gradle.model.LoginBean;

@Repository
@Transactional(readOnly = true)
public class ExtendedRepositoryImpl implements ExtendedRepositoryCustom {

	@PersistenceContext
	private EntityManager entityManager;
	

	@Override
	public boolean findByUsername(String username) {
        
        Query q = entityManager.createNativeQuery("SELECT a.id, a.username, a.password FROM mydb.login a where a.username LIKE ?", LoginBean.class);
        q.setParameter(1,username);
        List<LoginBean> authors = q.getResultList();
        String u1 = "";
        for (LoginBean a : authors) {
        	u1 = a.getUsername();
        }
        System.out.println(u1.equalsIgnoreCase(username));
        System.out.println("username is "+u1);
        return u1.equalsIgnoreCase(username);
	}

	@Override
	public boolean findByPassword(String password) {
		//Query q = entityManager.createNativeQuery("SELECT a.id, a.username, a.password FROM mydb.login a where a.username LIKE ?", LoginBean.class);
		Query q = entityManager.createNativeQuery("SELECT a.id, a.username, a.password FROM mydb.login a where a.password LIKE ?", LoginBean.class);
        q.setParameter(1,password);
        List<LoginBean> authors = q.getResultList();
        String p1 = "";
        for (LoginBean a : authors) {
        	p1 = a.getPassword();
        }
        System.out.println(p1.equals(password));
        System.out.println("password is "+p1);
        return p1.equals(password);
	}

	

}
