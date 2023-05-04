package in.myBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.myBlog.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer>{

}
