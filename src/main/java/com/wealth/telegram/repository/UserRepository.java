package com.wealth.telegram.repository;

import com.wealth.telegram.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
