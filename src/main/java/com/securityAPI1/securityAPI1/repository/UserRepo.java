package com.securityAPI1.securityAPI1.repository;

import com.securityAPI1.securityAPI1.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer>{
    Users findByUsername(String username);
}
