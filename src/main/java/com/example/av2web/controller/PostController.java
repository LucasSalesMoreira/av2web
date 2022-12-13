package com.example.av2web.controller;

import com.example.av2web.model.dto.PostDTO;
import com.example.av2web.service.IPostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/post")
public class PostController {

    private final IPostService postService;

    public PostController(IPostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public ResponseEntity<Object> getPosts() {
        return ResponseEntity.ok(postService.getPosts());
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody PostDTO post) {
        return ResponseEntity.ok(postService.create(post));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable String id, @RequestBody PostDTO post) {
        return ResponseEntity.ok(postService.updatePost(id, post));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable String id) {
        return ResponseEntity.ok(postService.deletePost(id));
    }
}