package com.blog.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @RequestMapping("/posts")
    @ResponseBody
    public String postIndex() {
        return "This is the posts index page.";
    }

    @RequestMapping("/posts/{id}")
    @ResponseBody
    public String indPost(@PathVariable String id) {
        return "View post # " + id;
    }

    @RequestMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "View the form for creating a post";
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String sendPost(){
        return "Create a new post";
    }

}
