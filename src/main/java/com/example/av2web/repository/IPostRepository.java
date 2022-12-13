package com.example.av2web.repository;

import com.example.av2web.model.entity.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostRepository extends CrudRepository<Post, String> {
    @Query(nativeQuery = true, value = "select * from post order by created_at desc")
    Iterable<Post> findAllOrderByCreatedAt();
}
