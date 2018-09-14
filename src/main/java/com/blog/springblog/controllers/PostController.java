package com.blog.springblog.controllers;

import com.blog.springblog.models.Post;
import com.blog.springblog.models.User;
import com.blog.springblog.repositories.PostsRepo;
import com.blog.springblog.repositories.UserRepository;
import com.blog.springblog.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    PostsRepo postsRepo;
    UserRepository userRepository;


    public PostController(PostsRepo postsRepo , UserRepository userRepository) {
        this.postsRepo = postsRepo;
        this.userRepository = userRepository;
    }

    @GetMapping("/posts")
    public String index(Model viewModel) {
        viewModel.addAttribute("posts", postsRepo.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String show(@PathVariable long id, Model viewModel) {
        viewModel.addAttribute("post", postsRepo.findOne(id));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String postCreateForm(Model model) {
        model.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String insertPost(@ModelAttribute Post post) {
        post.setUser(userRepository.findOne(1L));
        postsRepo.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String postEditForm(@PathVariable long id, Model model) {
        model.addAttribute("post", postsRepo.findOne(id));
        return "posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String updatePost(@ModelAttribute Post post) {
        // postSvc.save(post);
        System.out.println("Post updated!");
        return "redirect:/posts";
    }

}
