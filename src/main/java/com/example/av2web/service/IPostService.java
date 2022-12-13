package com.example.av2web.service;

import com.example.av2web.model.dto.PostDTO;
import com.example.av2web.model.dto.PostListDTO;
import org.springframework.stereotype.Service;

@Service
public interface IPostService {
    PostListDTO getPosts();
    PostDTO create(PostDTO postDTO);
    PostDTO updatePost(String id, PostDTO postDTO);
    boolean deletePost(String id);
}
