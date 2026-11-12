package com.example.SpringBootCRUD.repository;

import com.example.SpringBootCRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
//User = Your entity/model class.
//Long = Data type of your primary key (id).
//JpaRepository = Provides built-in database CRUD methods.
public interface UserRepository extends JpaRepository<User, Long> {
}
