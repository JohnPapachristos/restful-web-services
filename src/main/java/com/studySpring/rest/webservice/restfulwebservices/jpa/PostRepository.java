package com.studySpring.rest.webservice.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studySpring.rest.webservice.restfulwebservices.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{
}
