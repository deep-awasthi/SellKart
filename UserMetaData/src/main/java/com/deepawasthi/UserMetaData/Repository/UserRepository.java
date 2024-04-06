package com.deepawasthi.UserMetaData.Repository;

import com.deepawasthi.UserMetaData.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
