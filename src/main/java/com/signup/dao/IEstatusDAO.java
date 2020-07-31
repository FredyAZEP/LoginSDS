package com.signup.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.signup.entity.Estatus;

public interface IEstatusDAO extends JpaRepository<Estatus, Integer> {

}
