package com.example.demo.gradle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.gradle.model.LoginBean;

public interface LoginRepositoryInterface extends JpaRepository<LoginBean, Integer> {

}
