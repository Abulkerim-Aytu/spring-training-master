package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
// In this controller we try to manipulate some things like: change status code, past headers ..etc.
// Java Developers prefer to use this type of api endpoint creation all the time.
@RestController
@RequestMapping("/courses/api/v2")
public class CourseController_ResponseEntity {

    private final CourseService courseService;

    public CourseController_ResponseEntity(CourseService courseService) {
        this.courseService = courseService;
    }

    // With help of ResponseEntity class we can pass headers, we can manipulate statues code.
    @GetMapping
    public ResponseEntity<List<CourseDTO>> getAllCourses(){
    return ResponseEntity
            .status(HttpStatus.ACCEPTED)
            .header("Veersion", "Cydeo.V2")
            .header("Operation", "Get List")
            .body(courseService.getCourses());
    }

    @GetMapping("{id}")
    public ResponseEntity<CourseDTO> getCourseById(@PathVariable("id") long id){
        return ResponseEntity.ok(courseService.getCourseById(id));
        // the basic one si .OK
    }

    @GetMapping("category/{name}")
    public ResponseEntity<List<CourseDTO>> getCourseByCategory(@PathVariable("name") String courseCategory){
        return ResponseEntity.ok(courseService.getCoursesByCategory(courseCategory));
    }

}
