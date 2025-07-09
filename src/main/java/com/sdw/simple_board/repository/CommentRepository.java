package com.sdw.simple_board.repository;

import com.sdw.simple_board.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
