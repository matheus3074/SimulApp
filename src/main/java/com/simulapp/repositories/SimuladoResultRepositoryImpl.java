package com.simulapp.repositories;

import com.simulapp.Interfaces.SimuladoResultRepository;
import com.simulapp.entities.Simulado;
import com.simulapp.entities.SimuladoResult;
import com.simulapp.repositories.JPA.SimuladoResultJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SimuladoResultRepositoryImpl implements SimuladoResultRepository {
    private final SimuladoResultJpa simuladoResultJpa;

    @Autowired
    public SimuladoResultRepositoryImpl(SimuladoResultJpa simuladoResultJpa) {
        this.simuladoResultJpa = simuladoResultJpa;
    }

    @Override
    public SimuladoResult searchByCode(Long id) {
        return this.simuladoResultJpa.findById(id).orElse(null);  // Modificado para Long
    }

    @Override
    public List<SimuladoResult> buscar() {
        return this.simuladoResultJpa.findAll();
    }

    @Override
    public void addSimuladoResult(SimuladoResult simuladoResult) {
        this.simuladoResultJpa.save(simuladoResult);
    }

    @Override
    public void removeSimuladoResult(Long id) {
        this.simuladoResultJpa.deleteById(id);  // Modificado para Long
    }

    @Override
    public void updateSimuladoResult(Long id, SimuladoResult simuladoResult) {
        SimuladoResult simuladoResultInDb = this.simuladoResultJpa.findById(id).orElse(null);
        if (simuladoResultInDb != null) {
            simuladoResultInDb.setAcertos(simuladoResult.getAcertos());
            simuladoResultInDb.setErros(simuladoResult.getErros());
            simuladoResultInDb.setNotaFinal(simuladoResult.getNotaFinal());
            simuladoResultInDb.setDataRealizacao(simuladoResult.getDataRealizacao());

            this.simuladoResultJpa.save(simuladoResultInDb);
        }
    }

    @Override
    public boolean estaVazio() {
        return this.simuladoResultJpa.count() == 0;
    }
}
