package edu.udelp.movil.restproject.service;

import edu.udelp.movil.restproject.model.Tarea;

import java.util.List;

public interface TareaService {
	//Interfaz nos va a decir que metodo podemos hacer
    Tarea save(Tarea tarea); //Add
    List<Tarea> findAll();
    Tarea findById(Long id); //Encuentra por ID
    void remove(Long id); // Elimine por ID
}
