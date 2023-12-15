package net.prajwal.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.prajwal.springboot.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
