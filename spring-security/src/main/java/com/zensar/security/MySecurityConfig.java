package com.zensar.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {  // used for Authentication

		/*auth.inMemoryAuthentication()
		.withUser("Rahul")
		.password("Rahul@12")
		.roles("USER")
		.and()
		.withUser("Paul")
		.password("Paul@12")
		.roles("ADMIN");*/
		
		auth.userDetailsService(userDetailsService);
		
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {  // used for Authorization
		http
		.authorizeRequests()
		.antMatchers("/user").hasAnyRole("user")  // for user role
		.antMatchers("/admin").hasAnyRole("admin")// for Admin role
		.antMatchers("/all")                      // for all the users
		.permitAll()
		.and()
		.httpBasic();							 // for the type of login console, also can use .formlogin() 
	}
	
	
}
