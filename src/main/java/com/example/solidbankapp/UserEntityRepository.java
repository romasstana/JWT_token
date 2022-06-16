package com.example.solidbankapp;

import org.springframework.data.repository.CrudRepository;

public interface UserEntityRepository extends CrudRepository<UserEntity, Integer> {

    UserEntity findByLogin(String login);
}
