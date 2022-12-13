package com.example.av2web.model.entity;


import com.example.av2web.model.dto.PostDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "post")
public class Post {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "title")
    private String title;
    @Column(name = "body")
    private String body;
    @Column(name = "author")
    private String author;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Post() {

    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Post(String id, String title, String body, String author) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.author = author;
    }

    public Post(PostDTO postDTO) {
        this.id = UUID.randomUUID().toString();
        this.title = postDTO.getTitle();
        this.body = postDTO.getBody();
        this.author = postDTO.getAuthor();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
