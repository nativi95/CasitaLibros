/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.casitaLibros.service;

import com.empresa.casitaLibros.modelo.TipoLibro;
import java.util.List;

/**
 *
 * @author nativi
 */
public interface ITipoLibroService {
    public List<TipoLibro> tipoLibros();
    public void guardar (TipoLibro tipoLibro);
    public void eliminar (TipoLibro tipoLibro);
    public TipoLibro encontraLibro (TipoLibro tipoLibro);
}
