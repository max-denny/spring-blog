package com.blog.springblog.services;

import com.blog.springblog.models.Post;
import com.blog.springblog.repositories.PostsRepo;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    PostsRepo postsRepo;


    public PostService(PostsRepo postsRepo) {
        this.postsRepo = postsRepo;
    }


}