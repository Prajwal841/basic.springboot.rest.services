package net.prajwal.springboot.rest.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.prajwal.springboot.rest.services.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
