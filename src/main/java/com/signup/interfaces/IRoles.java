package com.signup.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.signup.model.Role;

@Repository
public interface IRoles extends CrudRepository<Role, Integer> {

}
