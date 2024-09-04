package com.vidal.rutas.services;

import com.vidal.rutas.dao.IRutasDao;
import com.vidal.rutas.models.Ruta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class RutasService {

    @Autowired
    IRutasDao rutasDao;


    public List<Ruta> getAll() {
        List<Ruta> listado = new ArrayList<>();
        listado = this.rutasDao.findAll();
        return listado;
    }


    public Optional<Ruta> findById(Long id) {
        Optional<Ruta> find = this.rutasDao.findById(id);
        if(find.isPresent()){
            return find;
        }
        return Optional.empty();
    }


    public Ruta save(Ruta t) {
        return this.rutasDao.save(t);
    }


    public void delete(Ruta t) {
        this.rutasDao.delete(t);
    }





}
