package com.example.av2web.model.dto;

import java.util.ArrayList;
import java.util.List;

public class PostListDTO {
    private List<PostDTO> posts;

    public PostListDTO(ArrayList<PostDTO> posts) {
        this.posts = posts;
    }

    public List<PostDTO> getPosts() {
        return posts;
    }

    public void setPosts(List<PostDTO> posts) {
        this.posts = posts;
    }
}
