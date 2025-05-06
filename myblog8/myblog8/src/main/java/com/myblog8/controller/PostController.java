package com.myblog8.controller;

import com.myblog8.payload.PostDto;
import com.myblog8.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/post")
public class PostController {


   // Technology has significantly transformed the way we live, work, and communicate. From smartphones to artificial intelligence, innovations continue to reshape industries and everyday experiences. People can now access information instantly, work remotely, and stay connected with others across the globe. While these advancements bring many benefits, they also raise concerns about privacy, screen addiction, and job displacement. As society continues to evolve, it's important to find a balance between embracing progress and addressing its challenges.
    @Autowired
    private PostService postService;



    //http://localhost:8080/api/post
    @PostMapping
    public ResponseEntity<PostDto> savePost(@RequestBody PostDto postDto){
        PostDto dto = postService.savePost(postDto);
        return new ResponseEntity<>(dto, HttpStatus.OK);//201

    }
}
