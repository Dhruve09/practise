package com.myblog8.service.impl;

import com.myblog8.entity.Post;
import com.myblog8.payload.PostDto;
import com.myblog8.repository.PostRepository;
import com.myblog8.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public PostDto savePost(PostDto postDto) {
        Post post = new Post();
        post.setContent(postDto.getContent());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());






            System.out.println("==========1=============");
            System.out.println("==========2=============");
            System.out.println("post================"+post);
            Post savedPost = postRepository.save(post);
            PostDto dto = new PostDto();
           dto.setId(savedPost.getId());
            dto.setTitle(savedPost.getTitle());
            dto.setDescription(savedPost.getDescription());
            dto.setContent(savedPost.getContent());


            return dto;

        }




        //return dto;
    }


