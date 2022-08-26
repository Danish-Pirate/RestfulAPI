package com.pirate.restfulapi.repository;

import com.pirate.restfulapi.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    public User findById(long id);
}
