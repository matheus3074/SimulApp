package com.simulapp.facades;

import com.simulapp.applications.SimuladoApplication;
import com.simulapp.entities.Simulado;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SimuladoFacade {
    private final SimuladoApplication simuladoApplication;

    public SimuladoFacade(SimuladoApplication simuladoApplication) {
        this.simuladoApplication = simuladoApplication;
    }

    public List<Simulado> listSimulado() {
        return simuladoApplication.obterTodosSimulado();
    }

    public Simulado getSimuladoForId(int id) {
        return simuladoApplication.obterSimuladoPorId(id);
    }

    public void saveSimulado(Simulado simulado) {
        simuladoApplication.criarSimulado(simulado);
    }

    public void deleteSimulado(int id) {
        simuladoApplication.excluirSimulado(id);
    }

    public void updateSimulado(int id, Simulado simulado) {
        simuladoApplication.atualizarSimulado(id, simulado);
    }
}
