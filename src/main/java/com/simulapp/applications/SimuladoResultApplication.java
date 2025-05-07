package com.simulapp.applications;

import com.simulapp.Interfaces.SimuladoResultRepository;
import com.simulapp.entities.SimuladoResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SimuladoResultApplication {
    private final SimuladoResultRepository simuladoResultRepository;

    public SimuladoResultApplication(SimuladoResultRepository simuladoResultRepository) {
        this.simuladoResultRepository = simuladoResultRepository;
    }

    public List<SimuladoResult> obterTodosSimuladoResult() {
        return simuladoResultRepository.buscar();
    }

    public SimuladoResult obterSimuladoResultPorId(long id) {
        return simuladoResultRepository.searchByCode(id);
    }

    public void criarSimuladoResult(SimuladoResult simuladoResult) {
        simuladoResultRepository.addSimuladoResult(simuladoResult);
    }

    public void excluirSimuladoResult(long id) {
        simuladoResultRepository.removeSimuladoResult(id);
    }

    public void atualizarSimuladoResult(int id, SimuladoResult simuladoResult) {
        simuladoResultRepository.updateSimuladoResult((long) id, simuladoResult);
    }
}
