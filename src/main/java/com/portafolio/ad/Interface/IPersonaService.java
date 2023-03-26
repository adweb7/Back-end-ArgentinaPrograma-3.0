/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafolio.ad.Interface;

import com.portafolio.ad.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    // Traer una persona
    public List<Persona> getPersona ();
    
    
    //Guardar un objeto de tipo Persona
    public void savePersona (Persona persona);
    
    // Eliminar un objeto pero lo buscamos por ID
    public void deletePersona (int id);
    
    // Buscar una persona por Id
    public Persona findPersona (int id);
}
