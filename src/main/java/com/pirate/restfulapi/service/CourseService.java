package com.pirate.restfulapi.service;

import com.pirate.restfulapi.model.Course;
import com.pirate.restfulapi.model.User;
import com.pirate.restfulapi.repository.CourseRepository;
import com.pirate.restfulapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
@Service
public class CourseService implements ICourse {
    private CourseRepository repo;

    CourseService(CourseRepository repo) {
        this.repo = repo;
    }

    @Override
    public Set<Course> findAll() {
        Set<Course> set = new HashSet<>();
        repo.findAll().forEach(set::add);
        return set;
    }

    @Override
    public Course save(Course object) {
        return null;
    }

    @Override
    public void delete(Course object) {

    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public Optional<Course> findById(String s) {
        return Optional.empty();
    }
}