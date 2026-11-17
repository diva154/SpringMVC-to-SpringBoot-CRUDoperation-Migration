package com.example.SpringBootCRUD.service;

import com.example.SpringBootCRUD.UserNotFoundException;
import com.example.SpringBootCRUD.repository.UserRepository;
import com.example.SpringBootCRUD.model.User;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional(readOnly = true)

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

@Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
    }


    @Override
    @Transactional
    public void saveUser(User user) {
        userRepository.save(user);
    }


    @Override
    @Transactional
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
