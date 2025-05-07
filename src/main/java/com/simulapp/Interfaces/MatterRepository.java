package com.simulapp.Interfaces;

import com.simulapp.entities.Matter;
import com.simulapp.entities.UserAnswer;

import java.util.List;

public interface MatterRepository {
    public Matter searchByCode(Long id);
    public List<Matter> buscar();
    public void addMatter(Matter matter);
    public void removeMatter(Long id);
    public void updateMatter(Long id, Matter matter);
    public boolean estaVazio();
}
