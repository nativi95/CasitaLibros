/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.casitaLibros.modelo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author nativi
 */
@Data
@Entity
@Table(name="tipo_libro")
public class TipoLibro implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipo;
    
    private String tipo;

    public TipoLibro(int id_tipo, String tipo) {
        this.idTipo = id_tipo;
        this.tipo = tipo;
    }

    public TipoLibro(int id_tipo) {
        this.idTipo = id_tipo;
    }

    public TipoLibro() {
    }
    
}
