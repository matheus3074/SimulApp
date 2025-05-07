package com.simulapp.controllers;

import com.simulapp.entities.Simulado;
import com.simulapp.facades.SimuladoFacade;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/simulado")
public class SimuladoController {
    private final SimuladoFacade simuladoFacade;

    public SimuladoController(SimuladoFacade simuladoFacade) {
        this.simuladoFacade = simuladoFacade;
    }

    @GetMapping
    public List<Simulado> listSimulado() {
        return simuladoFacade.listSimulado();
    }

    @GetMapping("/{id}")
    public Simulado getSimulado(@PathVariable int id) {
        return simuladoFacade.getSimuladoForId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createSimulado(@RequestBody Simulado simulado) {
        simuladoFacade.saveSimulado(simulado);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSimulado(@PathVariable int id) {
        simuladoFacade.deleteSimulado(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateSimulado(@PathVariable int id,@RequestBody Simulado simulado){
        simuladoFacade.updateSimulado(id, simulado);
    }
}
