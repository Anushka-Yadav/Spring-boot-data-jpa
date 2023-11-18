package com.SpringStart.Spring.Controller;

import com.SpringStart.Spring.entities.Courses;
import com.SpringStart.Spring.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private CourseService courseService;
    @GetMapping("/hello")
    public String hello(){
        return "Hello Anushka";
    }
    @GetMapping("/course")
    public List<Courses> getList(){
        return this.courseService.getCourses();
    }
    @GetMapping("/course/{courseId}")
    public Courses getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }
    @PostMapping("/courses")
    public Courses addCourse(@RequestBody Courses course){
        return this.courseService.addCourse(course);
    }
    @PutMapping("/update")
    public Courses updateCourse(@RequestBody Courses course){
        return this.courseService.updateCourse(course);
    }
    @DeleteMapping("/delete")
    public Courses deleteCourse(@RequestBody Courses course){
        return this.courseService.deleteCourse(course);
    }

}
