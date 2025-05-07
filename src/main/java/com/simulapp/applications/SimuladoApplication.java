package com.simulapp.applications;

import com.simulapp.Interfaces.SimuladoRepository;
import com.simulapp.entities.Simulado;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimuladoApplication {
    private final SimuladoRepository simuladoRepository;

    public SimuladoApplication(SimuladoRepository simuladoRepository) {
        this.simuladoRepository = simuladoRepository;
    }

    public List<Simulado> obterTodosSimulado() {
        return simuladoRepository.buscar();
    }

    public Simulado obterSimuladoPorId(long id) {
        return simuladoRepository.searchByCode(id);
    }

    public void criarSimulado(Simulado simulado) {
        simuladoRepository.addSimulado(simulado);
    }

    public void excluirSimulado(long id) {
        simuladoRepository.removeSimulado(id);
    }

    public void atualizarSimulado(int id, Simulado simulado) {
        simuladoRepository.updateSimulado((long) id, simulado);
    }
}
