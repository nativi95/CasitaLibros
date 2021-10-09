/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.casitaLibros.restServices;

import com.empresa.casitaLibros.modelo.Libro;
import com.empresa.casitaLibros.modelo.TipoLibro;
import com.empresa.casitaLibros.service.ILibroService;
import com.empresa.casitaLibros.service.ITipoLibroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nativi
 */
@RestController
public class RestLibro {
    
    @Autowired
    ILibroService iLibroService;
    @Autowired
    ITipoLibroService iTipoLibroService;
    
    @GetMapping("/")
    public List<Libro> start(){
        return iLibroService.Libros();
    }
    
    @PostMapping("/newBook")
    public void insertBook(@RequestParam(name = "titulo") String titulo,
                           @RequestParam(name = "autores") String autores,
                           @RequestParam(name = "id_tipo") int id_tipo){
        iLibroService.guardar(new Libro(0, titulo, autores, new TipoLibro(id_tipo)));
    }    
    
}
