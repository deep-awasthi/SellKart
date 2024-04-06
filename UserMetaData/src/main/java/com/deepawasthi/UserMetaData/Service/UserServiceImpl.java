package com.deepawasthi.UserMetaData.Service;

import com.deepawasthi.UserMetaData.Entity.UserEntity;
import com.deepawasthi.UserMetaData.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public UserEntity getUserDetails(Long userId) {
        return userRepository.findById(userId).orElseThrow(()->new RuntimeException("No User Found"));
    }
}
