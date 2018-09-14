package com.blog.springblog.models;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String title;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(nullable = false)
    private String body;

    @ManyToOne
    private User user;


    public Post(User user) {
        this.user = user;
    }

    public User getUsers() {
        return user;
    }

    public void setUsers(User users) {
        this.user = users;
    }

    public Post() {
    }

    //this is the contstructor we use to create
    public Post(String title, String body, User user) {
        this.title = title;
        this.body = body;
        this.user = user;
    }

    //This is the constructor we use to display everthing
    public Post(long id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}