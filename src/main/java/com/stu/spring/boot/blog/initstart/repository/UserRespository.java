package com.stu.spring.boot.blog.initstart.repository;

import com.stu.spring.boot.blog.initstart.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRespository extends CrudRepository<User,Long>{
}
