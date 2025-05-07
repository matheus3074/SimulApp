package com.simulapp.facades;

import com.simulapp.applications.MatterApplication;
import com.simulapp.entities.Matter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MatterFacade {
    private final MatterApplication matterApplication;

    public MatterFacade(MatterApplication matterApplication) {
        this.matterApplication = matterApplication;
    }

    public List<Matter> listMatter() {
        return matterApplication.obterTodosMatter();
    }

    public Matter getMatterForId(int id) {
        return matterApplication.obterMatterPorId(id);
    }

    public void saveMatter(Matter matter) {
        matterApplication.criarMatter(matter);
    }

    public void deleteMatter(int id) {
        matterApplication.excluirMatter(id);
    }

    public void updateMatter(int id, Matter matter) {
        matterApplication.atualizarMatter(id, matter);
    }
}
