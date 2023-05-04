package in.myBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.myBlog.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
