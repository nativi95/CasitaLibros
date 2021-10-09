/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.casitaLibros.service;

import com.empresa.casitaLibros.DAO.ITipoLibro;
import com.empresa.casitaLibros.modelo.TipoLibro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nativi
 */
@Service
public class TipoLibroServiceImpl implements ITipoLibroService{
    
    @Autowired
    ITipoLibro iTipoLibro;

    @Override
    public List<TipoLibro> tipoLibros() {
        return (List<TipoLibro>)iTipoLibro.findAll();
    }

    @Override
    public void guardar(TipoLibro tipoLibro) {
        iTipoLibro.save(tipoLibro);
    }

    @Override
    public void eliminar(TipoLibro tipoLibro) {
        iTipoLibro.delete(tipoLibro);
    }

    @Override
    public TipoLibro encontraLibro(TipoLibro tipoLibro) {
        return iTipoLibro.findById(tipoLibro.getIdTipo()).orElse(null);
    }
    
}
