package com.aplicacion.apuesta.controller;

import com.aplicacion.apuesta.entity.Arbitro;
import com.aplicacion.apuesta.entity.Jugador;
import com.aplicacion.apuesta.service.ArbitroService;
import com.aplicacion.apuesta.service.JugadorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiJugador/")
public class JugadorController {


   /* @Autowired
    private final JugadorServicio jugadorServicio;

    public JugadorController(JugadorServicio jugadorServicio) {
        this.jugadorServicio = jugadorServicio;
    }

    @GetMapping
    public List<Jugador> getAll(){
        System.out.println("Hola Mundo");
        return jugadorServicio.getjJugador();
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Jugador jugador){
        jugadorServicio.saveOrUpdate(jugador);
    }
    @DeleteMapping("/{jugadorId}")
    public void delete(@PathVariable("jugadorId") Long jugadorId){
        jugadorServicio.delete(jugadorId);
    }

*/
}
