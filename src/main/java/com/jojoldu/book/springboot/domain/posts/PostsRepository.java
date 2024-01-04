package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;


//DAO
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
