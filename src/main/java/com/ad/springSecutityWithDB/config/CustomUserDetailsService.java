package com.ad.springSecutityWithDB.config;

import com.ad.springSecutityWithDB.entity.Employee;
import com.ad.springSecutityWithDB.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private EmpRepo empRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Employee employee = empRepo.findByEmail(email);

        if (employee == null) {
            throw new UsernameNotFoundException("UserName not found exception");
        } else {
            return new CustomUser(employee);
        }
    }
}