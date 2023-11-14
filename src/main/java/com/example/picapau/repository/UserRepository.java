package com.example.picapau.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.picapau.domain.users.user;



public interface UserRepository extends JpaRepository<user, String>{
      UserDetails findByEmail(String email);  
}
