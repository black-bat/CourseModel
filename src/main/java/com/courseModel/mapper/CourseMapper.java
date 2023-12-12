package com.courseModel.mapper;

import com.courseModel.dto.CourseDTO;
import com.courseModel.dto.CreateCourseRequest;
import com.courseModel.entity.Course;
import org.springframework.stereotype.Component;

@Component
public class CourseMapper {
    public Course convert(CreateCourseRequest request) {
        return new Course()
                .setCourseName(request.getCourseName())
                .setCost(request.getCost());
    }

    public CourseDTO convert(Course course) {
        return new CourseDTO()
                .setCourseNumber(course.getCourseNumber())
                .setCourseName(course.getCourseName())
                .setCost(course.getCost());
    }
}
