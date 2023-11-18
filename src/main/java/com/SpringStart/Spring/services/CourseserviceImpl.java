package com.SpringStart.Spring.services;

import com.SpringStart.Spring.dao.CourseDao;
import com.SpringStart.Spring.entities.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseserviceImpl implements CourseService{
//    List<Courses> list;
    @Autowired
private CourseDao courseDao;
    public CourseserviceImpl(){
//        list=new ArrayList<>();
//        list.add(new Courses(101,"java core","java language"));
//        list.add(new Courses(102,"os","operating system"));
//        list.add(new Courses(103,"ada","algorithms"));
  }

    @Override
    public List<Courses> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Courses getCourse(Long courseId) {
//        Courses c = null;
//        for(Courses course:list){
//            if(course.getId()==courseId){
////                c = new Courses(courseId, c.getTitle(), c.getDiscription());
////                return c;
//                c=course;
//                break;
//            }
//        }
        return courseDao.getOne(courseId);
    }

    @Override
    public Courses addCourse(Courses course) {
//        list.add(course);
            courseDao.save(course);
        return course;
    }

    @Override
    public Courses updateCourse(Courses course) {

//        for (Courses co:list) {
//            if(co.getId()== course.getId()){
//                co.setTitle(course.getTitle());
//                co.setDiscription(course.getDiscription());
//                return co;
//
//            }
//        }
            courseDao.save(course);
        return course;
    }
    @Override

    public Courses deleteCourse(Courses course) {
//        List<Courses>l;
//        l=new ArrayList<>();
//        for(Courses c:list){
//            if(c.getId()!= course.getId()){
//                l.add(c);
//            }
//        }
//        list=l;
        courseDao.delete(course);
        return course;
    }



}
