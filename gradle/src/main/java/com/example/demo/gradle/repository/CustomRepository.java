package com.example.demo.gradle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.gradle.model.LoginBean;


@Repository
@Transactional(readOnly = true)
public interface CustomRepository extends JpaRepository<LoginBean, Integer> {

	@Query(value="SELECT a.id, a.username, a.password FROM login a where a.username=?1", nativeQuery=true)
	public LoginBean findByUsername(String username);
	
}
