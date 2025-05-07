package com.simulapp.repositories.JPA;

import com.simulapp.entities.SimuladoResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimuladoResultJpa extends JpaRepository<SimuladoResult, Long>{
}
