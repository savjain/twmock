package com.tw.mock.east.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	User findOneByUsername(String username);

}
