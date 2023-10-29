package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// In this controller we try to manipulate some things like: change status code, past headers ..etc.
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

    @PostMapping
    public ResponseEntity<CourseDTO> createCourse(@RequestBody CourseDTO course){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("Operation", "Create")
                .body(courseService.createCourse(course));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteCourseById(@PathVariable("id") long courseId){
        courseService.deleteCourseById(courseId);
        return ResponseEntity.noContent().build(); // because of return type is ResponseEntity
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> updateCourse(@PathVariable("id") long courseId, @RequestBody CourseDTO course){
        courseService.updateCourse(courseId,course);
        return ResponseEntity.noContent().build();
    }

}
