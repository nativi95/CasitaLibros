/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.casitaLibros.service;

import com.empresa.casitaLibros.DAO.ILibro;
import com.empresa.casitaLibros.modelo.Libro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nativi
 */
@Service
public class LibroServiceImpl implements ILibroService{
    
    @Autowired
    private ILibro iLibro;

    @Override
    public List<Libro> Libros() {
        return (List<Libro>) iLibro.findAll();
    }

    @Override
    public void guardar(Libro libro) {
        iLibro.save(libro);
    }

    @Override
    public void eliminar(Libro libro) {
        iLibro.delete(libro);
    }

    @Override
    public Libro encontraLibro(Libro libro) {
        return iLibro.findById(libro.getIdLibro()).orElse(null);
    }
    
}
