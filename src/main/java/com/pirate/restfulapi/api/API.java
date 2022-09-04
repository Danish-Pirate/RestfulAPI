package com.pirate.restfulapi.api;

import com.pirate.restfulapi.model.Course;
import com.pirate.restfulapi.model.User;
import com.pirate.restfulapi.service.CourseService;
import com.pirate.restfulapi.service.UserService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Set;

@RestController
public class API {
    private UserService userService;
    private CourseService courseService;

    public API(UserService userService, CourseService courseService) {
        this.userService = userService;
        this.courseService = courseService;
    }

    @GetMapping("/getAllUser")
    public ResponseEntity<Set<User>> getAllUser() {
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/addUser/{name}/{age}")
    public ResponseEntity<Set<User>> addUser(@PathVariable("name") String name, @PathVariable("age") int age) {
        userService.save(new User(name, age));
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/deleteUser/{id}")
    public ResponseEntity<Set<User>> deleteUser(@PathVariable("id") long id) {
        userService.deleteById(id);
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/editUser/{id}/{newName}/{newAge}")
    public ResponseEntity<Set<User>> editUser(@PathVariable("id") long id, @PathVariable("newName") String newName, @PathVariable("newAge") int newAge) {
        userService.editUser(newName, newAge, id);
        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/addCourse")
    public ResponseEntity<Set<Course>> addCourse(Course course) {
        courseService.save(course);
        return new ResponseEntity<>(courseService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/getAllCourse")
    public ResponseEntity<Set<Course>> getAllCourse() {
        return new ResponseEntity<>(courseService.findAll(), HttpStatus.OK);
    }
}
