package com.simulapp.repositories.JPA;

import com.simulapp.entities.Simulado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimuladoJpa extends JpaRepository<Simulado, Long>{
}
