package com.deepawasthi.UserMetaData.Service;

import com.deepawasthi.UserMetaData.Entity.UserEntity;

public interface UserService {
    public UserEntity createUser(UserEntity user);

    public UserEntity getUserDetails(Long userId);
}
