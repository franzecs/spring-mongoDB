package com.ikytus.fp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ikytus.fp.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
