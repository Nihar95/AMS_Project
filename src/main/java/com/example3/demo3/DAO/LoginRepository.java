package com.example3.demo3.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example3.demo3.Model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,String> {

}
