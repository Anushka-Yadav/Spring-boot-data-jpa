package com.SpringStart.Spring.services;

import com.SpringStart.Spring.entities.Courses;

import java.util.List;

public interface CourseService {
    public List<Courses> getCourses();
    public Courses getCourse(Long courseId);
    public Courses addCourse(Courses course);

    public Courses updateCourse(Courses course);

    Courses deleteCourse(Courses course);
}
