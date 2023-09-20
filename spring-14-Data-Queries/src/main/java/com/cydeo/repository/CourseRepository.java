package com.cydeo.repository;

import com.cydeo.entity.Course;
import org.hibernate.usertype.CompositeUserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course,Long> {
    // Find all courses by category
    List<Course> findByCategory(String category);

    // Find all courses by category and order the entities by name
    List<Course> findByCategoryOrderByName(String category);

    // Checks if a course with the supplied name exist. Return true if exists, false otherwise
    boolean existsByName(String name);

    // Returns the count of courses for the given category
    List<Course> countByCategory(String category);

    //Finds all the courses that start with the given course name string
    List<Course> findByNameStartingWith(String pattern);

    // Find all courses by category and returns a stream
    Stream<Course> streamAllByCategory(String category);


}
