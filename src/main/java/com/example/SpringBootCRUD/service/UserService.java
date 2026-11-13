package com.example.SpringBootCRUD.service;
import com.example.SpringBootCRUD.model.User;
import java.util.List;
public interface UserService {
        List<User> getAllUsers();

        User getUserById(Long id);

        void saveUser(User user);

        void updateUser(User user);

        void deleteUser(Long id);
    }


