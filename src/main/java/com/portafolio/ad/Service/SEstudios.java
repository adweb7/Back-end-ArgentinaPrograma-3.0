/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.ad.Service;

import com.portafolio.ad.Entity.Estudios;
import com.portafolio.ad.Repository.REstudios;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEstudios {
    @Autowired
    REstudios rEstudios;
    
    public List<Estudios> list(){
        return rEstudios.findAll();
    }
    
    public Optional<Estudios> getOne(int id){
        return rEstudios.findById(id);
    }
    
    public Optional<Estudios> getByNmbreE(String nombreE){
        return rEstudios.findByNombreE(nombreE);
    }
    
    public void save(Estudios estudios){
        rEstudios.save(estudios);
    }
    
    public void delete(int id){
        rEstudios.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rEstudios.existsById(id);
    }
    
    public boolean existsByNombreE(String nombreE){
        return rEstudios.existsByNombreE(nombreE);
    }
}