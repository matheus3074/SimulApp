package com.simulapp.facades;

import com.simulapp.applications.SimuladoResultApplication;
import com.simulapp.entities.SimuladoResult;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SimuladoResultFacade {
    private final SimuladoResultApplication simuladoResultApplication;

    public SimuladoResultFacade(SimuladoResultApplication simuladoResultApplication) {
        this.simuladoResultApplication = simuladoResultApplication;
    }

    public List<SimuladoResult> listSimuladoResult() {
        return simuladoResultApplication.obterTodosSimuladoResult();
    }

    public SimuladoResult getSimuladoResultForId(int id) {
        return simuladoResultApplication.obterSimuladoResultPorId(id);
    }

    public void saveSimuladoResult(SimuladoResult simuladoResult) {
        simuladoResultApplication.criarSimuladoResult(simuladoResult);
    }

    public void deleteSimuladoResult(int id) {
        simuladoResultApplication.excluirSimuladoResult(id);
    }

    public void updateSimuladoResult(int id, SimuladoResult simuladoResult) {
        simuladoResultApplication.atualizarSimuladoResult(id, simuladoResult);
    }
}
