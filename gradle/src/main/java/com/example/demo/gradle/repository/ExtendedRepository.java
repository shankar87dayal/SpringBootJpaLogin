package com.example.demo.gradle.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.gradle.model.*;

@Repository
public interface ExtendedRepository extends JpaRepository<LoginBean, Integer> , ExtendedRepositoryCustom {
	
	
}
