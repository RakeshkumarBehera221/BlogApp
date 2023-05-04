package in.myBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.myBlog.entity.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
