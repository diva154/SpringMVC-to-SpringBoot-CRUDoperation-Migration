package com.example.SpringBootCRUD.service;

import com.example.SpringBootCRUD.repository.UserRepository;
import com.example.SpringBootCRUD.model.User;
 import org.springframework.stereotype.Service;
import java.util.List;
 //remove @Transactional annotation
//make changes to all CRUD operations with userRepository

@Service
public class UserServiceImpl {

    private final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {

        this.userRepository = userRepository;
    }
    //get all users

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //get user by ID
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    //Save user
    public void saveUser(User user) {
        userRepository.save(user);
    }

    //update user
    public void updateUser(User user) { userRepository.save(user);
    }

    //delete user
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
