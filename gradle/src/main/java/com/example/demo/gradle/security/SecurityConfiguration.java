/*package com.example.demo.gradle.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.gradle.model.LoginBean;
import com.example.demo.gradle.repository.LoginRepositoryInterface;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	

	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth)
			throws Exception {
		auth
		.inMemoryAuthentication()
		.passwordEncoder(NoOpPasswordEncoder.getInstance())
		.withUser("Akrapovic")
		//.withUser(((LoginBean) loginBean).getUsername())
		.password("test")
		//.password(((LoginBean) loginBean).getPassword());
		.roles("USER", "ADMIN"); // To verify authentication & authorization
		
		
		
	}
	
	@SuppressWarnings("deprecation")
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
	    return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception { // To set authorization
		http.authorizeRequests()
		.antMatchers("/login").permitAll()
		.antMatchers("/").access("hasRole('USER')")
		.and()
		.formLogin();//with spring boot default login
		//.formLogin().loginPage("/login");//with spring boot default custom login page as login.jsp
	}
}*/
