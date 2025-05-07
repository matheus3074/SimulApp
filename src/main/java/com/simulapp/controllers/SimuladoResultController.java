package com.simulapp.controllers;

import com.simulapp.entities.SimuladoResult;
import com.simulapp.facades.SimuladoResultFacade;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/simuladoResult")
public class SimuladoResultController {
    private final SimuladoResultFacade simuladoResultFacade;

    public SimuladoResultController(SimuladoResultFacade simuladoResultFacade) {
        this.simuladoResultFacade = simuladoResultFacade;
    }

    @GetMapping
    public List<SimuladoResult> listSimuladoResult() {
        return simuladoResultFacade.listSimuladoResult();
    }

    @GetMapping("/{id}")
    public SimuladoResult getSimuladoResult(@PathVariable int id) {
        return simuladoResultFacade.getSimuladoResultForId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createSimuladoResult(@RequestBody SimuladoResult simuladoResult) {
        simuladoResultFacade.saveSimuladoResult(simuladoResult);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSimuladoResult(@PathVariable int id) {
        simuladoResultFacade.deleteSimuladoResult(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateSimuladoResult(@PathVariable int id,@RequestBody SimuladoResult simuladoResult){
        simuladoResultFacade.updateSimuladoResult(id, simuladoResult);
    }
}
