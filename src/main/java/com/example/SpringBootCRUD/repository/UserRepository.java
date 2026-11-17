package com.example.SpringBootCRUD.repository;

import com.example.SpringBootCRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
