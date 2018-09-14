package com.blog.springblog.repositories;

import com.blog.springblog.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepo extends CrudRepository<Post, Long> {


}
