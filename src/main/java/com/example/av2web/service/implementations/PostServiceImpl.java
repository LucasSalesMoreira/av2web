package com.example.av2web.service.implementations;

import com.example.av2web.model.dto.PostDTO;
import com.example.av2web.model.dto.PostListDTO;
import com.example.av2web.model.entity.Post;
import com.example.av2web.repository.IPostRepository;
import com.example.av2web.service.IPostService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class PostServiceImpl implements IPostService {

    private final IPostRepository postRepository;

    PostServiceImpl(IPostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostListDTO getPosts() {
        ArrayList<PostDTO> list = new ArrayList<>();
        postRepository.findAllOrderByCreatedAt().forEach(post -> {
            PostDTO postDTO = new PostDTO(
                    post.getId(),
                    post.getTitle(),
                    post.getBody(),
                    post.getAuthor()
            );
            list.add(postDTO);
        });
        return new PostListDTO(list);
    }

    @Override
    public PostDTO create(PostDTO postDTO) {
        Post post = new Post(postDTO);
        postRepository.save(post);
        return new PostDTO(post);
    }

    @Override
    public PostDTO updatePost(String id, PostDTO postDTO) {
        Optional<Post> postOptional = postRepository.findById(id);
        if (postOptional.isPresent()) {
            Post post = postOptional.get();
            post.setTitle(postDTO.getTitle());
            post.setBody(postDTO.getBody());
            postRepository.save(post);
            return new PostDTO(post);
        } else {
            return null;
        }
    }

    @Override
    public boolean deletePost(String id) {
        Optional<Post> postOptional = postRepository.findById(id);
        if (postOptional.isPresent()) {
            postRepository.delete(postOptional.get());
            return true;
        } else {
            return false;
        }
    }
}
