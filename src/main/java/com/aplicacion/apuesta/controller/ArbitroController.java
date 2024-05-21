package com.aplicacion.apuesta.controller;

import com.aplicacion.apuesta.entity.Arbitro;
import com.aplicacion.apuesta.service.ArbitroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class ArbitroController {

    @Autowired
    private final ArbitroService arbitroService;

    public ArbitroController(ArbitroService arbitroService) {
        this.arbitroService = arbitroService;
    }
    @GetMapping
    public List<Arbitro>  getAll(){

        return arbitroService.getArbitros();
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Arbitro arbitro){
        arbitroService.saveOrUpdate(arbitro);
    }
    @DeleteMapping("/{arbitroId}")
    public void delete(@PathVariable("arbitroId") Long arbitroId){
        arbitroService.delete(arbitroId);
    }
    @GetMapping("/{arbitroId}")
    public Optional <Arbitro> getById(@PathVariable("arbitroId") Long arbitroId){
        return arbitroService.getArbitro(arbitroId);
    }

}
