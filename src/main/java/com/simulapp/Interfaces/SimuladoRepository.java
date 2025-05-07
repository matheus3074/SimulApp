package com.simulapp.Interfaces;

import com.simulapp.entities.Simulado;
import com.simulapp.entities.UserAnswer;

import java.util.List;

public interface SimuladoRepository {
    public Simulado searchByCode(Long id);
    public List<Simulado> buscar();
    public void addSimulado(Simulado simulado);
    public void removeSimulado(Long id);
    public void updateSimulado(Long id, Simulado simulado);
    public boolean estaVazio();
}
