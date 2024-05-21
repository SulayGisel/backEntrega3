package com.aplicacion.apuesta.service;

import com.aplicacion.apuesta.entity.Arbitro;
import com.aplicacion.apuesta.repository.ArbitroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArbitroService {
    @Autowired
    ArbitroRepository arbitroRepository;

    public List<Arbitro> getArbitros(){
        return arbitroRepository.findAll();
    }
    public Optional<Arbitro> getArbitro(Long id){
        return arbitroRepository.findById(id);
    }

    public void saveOrUpdate(Arbitro arbitro){
        arbitroRepository.save(arbitro);
    }

    public void delete(Long id){
        arbitroRepository.deleteById(id);
    }

}
