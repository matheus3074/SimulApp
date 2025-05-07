package com.simulapp.repositories;

import com.simulapp.Interfaces.SimuladoRepository;
import com.simulapp.entities.Simulado;
import com.simulapp.repositories.JPA.SimuladoJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SimuladoRepositoryImpl implements SimuladoRepository {
    private final SimuladoJpa simuladoJpa;

    @Autowired
    public SimuladoRepositoryImpl(SimuladoJpa simuladoJpa) {
        this.simuladoJpa = simuladoJpa;
    }

    @Override
    public Simulado searchByCode(Long id) {
        return this.simuladoJpa.findById(id).orElse(null);  // Modificado para Long
    }

    @Override
    public List<Simulado> buscar() {
        return this.simuladoJpa.findAll();
    }

    @Override
    public void addSimulado(Simulado simulado) {
        this.simuladoJpa.save(simulado);
    }

    @Override
    public void removeSimulado(Long id) {
        this.simuladoJpa.deleteById(id);  // Modificado para Long
    }

    @Override
    public void updateSimulado(Long id, Simulado simulado) {
        Simulado simuladoInDb = this.simuladoJpa.findById(id).orElse(null);
        if (simuladoInDb != null) {
            simuladoInDb.setTitulo(simulado.getTitulo());
            simuladoInDb.setDescricao(simulado.getDescricao());
            simuladoInDb.setDataCriacao(simulado.getDataCriacao());

            this.simuladoJpa.save(simuladoInDb);
        }
    }

    @Override
    public boolean estaVazio() {
        return this.simuladoJpa.count() == 0;
    }
}
