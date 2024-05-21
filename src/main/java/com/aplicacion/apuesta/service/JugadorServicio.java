package com.aplicacion.apuesta.service;

import com.aplicacion.apuesta.entity.Arbitro;
import com.aplicacion.apuesta.entity.Jugador;
import com.aplicacion.apuesta.repository.JugadorReposity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class JugadorServicio {
    @Autowired
    JugadorReposity jugadorReposity;

    public List<Jugador> getjJugador(){
        return jugadorReposity.findAll();
    }
    public Optional<Jugador> getArbitro(Long id){
        return jugadorReposity.findById(id);
    }

    public void saveOrUpdate(Jugador jugador){
        jugadorReposity.save(jugador);
    }

    public void delete(Long id){
        jugadorReposity.deleteById(id);
    }

}
