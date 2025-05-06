package com.simulapp.repositories.JPA;

import com.simulapp.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersJpa extends JpaRepository<Users, Long> {
}
