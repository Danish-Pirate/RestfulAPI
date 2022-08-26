package com.pirate.restfulapi.service;

import com.pirate.restfulapi.model.User;
import com.pirate.restfulapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService implements IUser {

    private UserRepository repo;

    UserService(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public Set<User> findAll() {
        Set<User> set = new HashSet<>();
        repo.findAll().forEach(set::add);
        return set;
    }

    @Override
    public User save(User object) {
        return repo.save(object);
    }

    public void editUser(String newName, int newAge, long id) {
        User user = repo.findById(id);
        user.setAge(newAge);
        user.setName(newName);
        repo.save(user);
    }

    @Override
    public void delete(User object) {

    }

    @Override
    public void deleteById(Long aLong) {
        repo.deleteById(aLong);
    }

    @Override
    public Optional<User> findById(Long aLong) {
        return Optional.empty();
    }
}
