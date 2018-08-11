package com.example.demo.gradle.repository;

import java.util.List;

import com.example.demo.gradle.model.LoginBean;

public interface ExtendedRepositoryCustom {

	public boolean findByUsername(String username);

	public boolean findByPassword(String password);
}
