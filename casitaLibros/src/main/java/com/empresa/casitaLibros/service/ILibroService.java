/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.casitaLibros.service;

import com.empresa.casitaLibros.modelo.Libro;
import java.util.List;

/**
 *
 * @author nativi
 */
public interface ILibroService {
    public List<Libro> Libros();
    public void guardar (Libro libro);
    public void eliminar (Libro libro);
    public Libro encontraLibro (Libro libro);
}
