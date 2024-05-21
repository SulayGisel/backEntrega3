package com.aplicacion.apuesta.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="arbitro")
public class Arbitro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArbitro;
    private String nombre;
    private String apellido;
    private  String identificacion;
    private String telefono;
  //  private String direccion;
    private String correoElectronico;
    private String contrasena;
}
