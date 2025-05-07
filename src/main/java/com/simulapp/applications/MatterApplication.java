package com.simulapp.applications;

import com.simulapp.Interfaces.MatterRepository;
import com.simulapp.entities.Matter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatterApplication {
    private final MatterRepository matterRepository;

    public MatterApplication(MatterRepository matterRepository) {
        this.matterRepository = matterRepository;
    }

    public List<Matter> obterTodosMatter() {
        return matterRepository.buscar();
    }

    public Matter obterMatterPorId(long id) {
        return matterRepository.searchByCode(id);
    }

    public void criarMatter(Matter matter) {
        matterRepository.addMatter(matter);
    }

    public void excluirMatter(long id) {
        matterRepository.removeMatter(id);
    }

    public void atualizarMatter(int id, Matter matter) {
        matterRepository.updateMatter((long) id, matter);
    }
}
