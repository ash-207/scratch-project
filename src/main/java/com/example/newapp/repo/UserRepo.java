package com.example.newapp.repo;

import com.example.newapp.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Long> {
    // custom queries later if needed
}
