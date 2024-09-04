package com.vidal.camiones.services;

import com.vidal.camiones.dao.ICamionesDao;
import com.vidal.camiones.models.Camion;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class CamionesService {

    @Autowired
    ICamionesDao camionesDao;


    public List<Camion> getAll() {
        List<Camion> listado = new ArrayList<>();
        listado = this.camionesDao.findAll();
        return listado;
    }


    public Optional<Camion> findById(Long id) {
        Optional<Camion> find = this.camionesDao.findById(id);
        if(find.isPresent()){
            return find;
        }
        return Optional.empty();
    }


    public Camion save(Camion t) {
        return this.camionesDao.save(t);
    }


    public void delete(Camion t) {
        this.camionesDao.delete(t);
    }


}
