package com.example.anotheroneproject.services;

import com.example.anotheroneproject.dao.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("super_in_db")
public class SuperUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    public SuperUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var user = userRepository.findUserByUserName(username);
        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username));
        return user.map(SuperUserDetails::new).get();
    }
}
