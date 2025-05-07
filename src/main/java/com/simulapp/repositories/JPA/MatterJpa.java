package com.simulapp.repositories.JPA;

import com.simulapp.entities.Matter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatterJpa extends JpaRepository<Matter, Long>{
}
