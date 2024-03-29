package com.school.sba.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.school.sba.repository.UserRepo;

@Component
public class CustomUserDetailService implements UserDetailsService
{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRepo.findByUserName(username).map(user -> new CustomUserDetails(user))
				.orElseThrow(() -> new UsernameNotFoundException("User name found in the given Id"));
	}
}
