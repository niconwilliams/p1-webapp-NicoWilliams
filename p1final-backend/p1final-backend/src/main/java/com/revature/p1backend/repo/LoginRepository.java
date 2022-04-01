package com.revature.p1backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.p1backend.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
	Login findByUsernameAndPassword(String username, String password);

	}

