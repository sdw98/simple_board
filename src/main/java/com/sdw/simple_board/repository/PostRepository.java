package com.sdw.simple_board.repository;

import com.sdw.simple_board.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository  extends JpaRepository<Post, Integer> {
}
