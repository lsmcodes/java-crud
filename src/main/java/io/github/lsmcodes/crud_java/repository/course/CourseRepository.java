package io.github.lsmcodes.crud_java.repository.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.lsmcodes.crud_java.model.course.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    
}