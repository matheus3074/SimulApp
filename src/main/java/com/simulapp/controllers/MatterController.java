package com.simulapp.controllers;

import com.simulapp.entities.Matter;
import com.simulapp.facades.MatterFacade;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matter")
public class MatterController {
    private final MatterFacade matterFacade;

    public MatterController(MatterFacade matterFacade) {
        this.matterFacade = matterFacade;
    }

    @GetMapping
    public List<Matter> listMatter() {
        return matterFacade.listMatter();
    }

    @GetMapping("/{id}")
    public Matter getMatter(@PathVariable int id) {
        return matterFacade.getMatterForId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createMatter(@RequestBody Matter matter) {
        matterFacade.saveMatter(matter);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMatter(@PathVariable int id) {
        matterFacade.deleteMatter(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateMatter(@PathVariable int id,@RequestBody Matter matter){
        matterFacade.updateMatter(id, matter);
    }
}
