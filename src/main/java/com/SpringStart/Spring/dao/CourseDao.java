package com.SpringStart.Spring.dao;

import com.SpringStart.Spring.entities.Courses;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Courses,Long> {

}
