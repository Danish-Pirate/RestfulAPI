package com.pirate.restfulapi.repository;

import com.pirate.restfulapi.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
}
