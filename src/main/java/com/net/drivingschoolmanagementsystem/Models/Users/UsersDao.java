package com.net.drivingschoolmanagementsystem.Models.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersDao extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
}
