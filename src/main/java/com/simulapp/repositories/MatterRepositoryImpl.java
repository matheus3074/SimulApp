package com.simulapp.repositories;

import com.simulapp.Interfaces.MatterRepository;
import com.simulapp.entities.Matter;
import com.simulapp.entities.UserAnswer;
import com.simulapp.repositories.JPA.MatterJpa;
import com.simulapp.repositories.JPA.UserAnswerJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MatterRepositoryImpl implements MatterRepository {
    private final MatterJpa matterJpa;

    @Autowired
    public MatterRepositoryImpl(MatterJpa matterJpa) {
        this.matterJpa = matterJpa;
    }

    @Override
    public Matter searchByCode(Long id) {
        return this.matterJpa.findById(id).orElse(null);  // Modificado para Long
    }

    @Override
    public List<Matter> buscar() {
        return this.matterJpa.findAll();
    }

    @Override
    public void addMatter(Matter matter) {
        this.matterJpa.save(matter);
    }

    @Override
    public void removeMatter(Long id) {
        this.matterJpa.deleteById(id);  // Modificado para Long
    }

    @Override
    public void updateMatter(Long id, Matter matter) {
        Matter matterInDb = this.matterJpa.findById(id).orElse(null);
        if (matterInDb != null) {
            matterInDb.setNome(matter.getNome());
            matterInDb.setAreaConhecimento(matter.getAreaConhecimento());

            this.matterJpa.save(matterInDb);
        }
    }

    @Override
    public boolean estaVazio() {
        return this.matterJpa.count() == 0;
    }
}
