package com.example.demo.repo;

import com.example.demo.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo  extends CrudRepository<UserEntity,Long> {


}
