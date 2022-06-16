package com.example.solidbankapp;


import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

public interface RoleEntityRepository extends CrudRepository<RoleEntity, Integer> {

    RoleEntity findByName(String name);
    @Query
    RoleEntity findRoleEntityById(Integer id);
}