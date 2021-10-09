/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.casitaLibros.DAO;

import com.empresa.casitaLibros.modelo.TipoLibro;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author nativi
 */
public interface ITipoLibro extends CrudRepository<TipoLibro, Integer>{
    
}
