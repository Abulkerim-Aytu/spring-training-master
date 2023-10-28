package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// These all are API EndPoints
@RestController //@Controller + @ResponseBody // with this Annotation MVC' VIEW is are out of box, we use API instead of view in here.
@RequestMapping("/courses")
public class CourseController {

    // what ever we put in to the controllers are DTO

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseDTO> getAllCourses(){

        // return all courses
        return courseService.getCourses();
    }

    @GetMapping("{id}")
    public CourseDTO getCourseById(@PathVariable("id")long courseId){
        return courseService.getCourseById(courseId);
    }

    @GetMapping("category/{name}")
    public List<CourseDTO> getCourseByCategory (@PathVariable("name")String courseCategory){
        return courseService.getCoursesByCategory(courseCategory);
    }

    @PostMapping
    public CourseDTO createCourse(@RequestBody CourseDTO course){
        return courseService.createCourse(course);
    }

    @PutMapping("{id}")
    public void updateCourse(@PathVariable("id") long courseId, @RequestBody CourseDTO course){
        courseService.updateCourse(courseId,course);
    }

    @DeleteMapping("{id}")
    public void deleteCourseById(@PathVariable("id") long courseId){
        courseService.deleteCourseById(courseId);
    }

}
