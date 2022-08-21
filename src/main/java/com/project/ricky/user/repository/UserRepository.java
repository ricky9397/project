package com.project.ricky.user.repository;

import com.project.ricky.user.vo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
