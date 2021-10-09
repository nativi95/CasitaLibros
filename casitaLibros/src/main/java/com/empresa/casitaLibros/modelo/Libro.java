/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.casitaLibros.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author nativi
 */
@Data
@Entity
@Table(name = "libros")
public class Libro implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLibro;
    
    private String titulo;
    
    private String autores;
    
    @ManyToOne
    @JoinColumn(name = "id_tipo")
    TipoLibro idTipo;

    public Libro() {
    }

    public Libro(int idLibro) {
        this.idLibro = idLibro;
    }

    public Libro(int idLibro, String titulo, String autores, TipoLibro idTipo) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autores = autores;
        this.idTipo = idTipo;
    }
    
    
}
