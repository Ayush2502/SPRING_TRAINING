package com.example.spring_training.configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import java.net.http.HttpClient;

@EnableWebSecurity
public class webConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception{
      auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
              .withUser("user1").password("password").roles("USER")
              .and()
              .withUser("user2").password("password").roles("ADMIN");
    }
    @Override
    public void configure(HttpSecurity http) throws Exception{
       http.csrf().disable();
http.authorizeRequests().antMatchers("/**").hasRole("USER")
        .and().formLogin();
    }

}
