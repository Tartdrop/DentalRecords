package com.postgresql.dental.services;

import com.postgresql.dental.models.User;
import com.postgresql.dental.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class UserService implements UserDetailsService{
	 @Autowired
	    private UserRepository userRepository;

		 @Autowired
		 private BCryptPasswordEncoder bCryptPasswordEncoder;

	    public User registerUser(User user) {
	        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	        return userRepository.save(user);
	    }

	    public Optional<User> findByEmail(String email) {
	        return userRepository.findByEmail(email);
	    }

	    @Override
	    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	        User user = userRepository.findByEmail(email)
	                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
	        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), new ArrayList<>());
	    }
}
