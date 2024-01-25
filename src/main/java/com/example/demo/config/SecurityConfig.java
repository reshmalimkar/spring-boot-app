package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	//v4/ is Secure api 
	//v1/v2/v3/are non-secure api
		
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/v1/**", "/v2/**", "/v3/**").permitAll()// public
				.antMatchers("/v4/**").authenticated().and().formLogin()
				.and()
				.httpBasic().disable().csrf().disable().authorizeRequests().anyRequest().permitAll();
	}
	
	  /*@Bean
	    @Override
	    public UserDetailsService userDetailsService() {
	        UserDetails user = User.withDefaultPasswordEncoder()
	            .username("user")
	            .password("password")
	            .roles("USER")
	            .build();

	        return new InMemoryUserDetailsManager(user);
	    }*/
	
}
