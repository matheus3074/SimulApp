package com.simulapp.Interfaces;

import com.simulapp.entities.SimuladoResult;
import java.util.List;

public interface SimuladoResultRepository {
    public SimuladoResult searchByCode(Long id);
    public List<SimuladoResult> buscar();
    public void addSimuladoResult(SimuladoResult simuladoResult);
    public void removeSimuladoResult(Long id);
    public void updateSimuladoResult(Long id, SimuladoResult simuladoResult);
    public boolean estaVazio();
}
