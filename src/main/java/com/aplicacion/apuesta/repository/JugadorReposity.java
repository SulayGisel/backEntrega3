package com.aplicacion.apuesta.repository;

import com.aplicacion.apuesta.entity.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

public   interface JugadorReposity extends JpaRepository<Jugador, Long> {

}
