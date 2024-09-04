package com.vidal.camiones.services;

import com.vidal.camiones.dao.ICamionesDao;
import com.vidal.camiones.models.Camion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; // Importar esta anotación

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service // Añadir esta anotación
public class CamionesService {

    @Autowired
    ICamionesDao camionesDao;

    public List<Camion> getAll() {
        return camionesDao.findAll();
    }

    public Optional<Camion> findById(Long id) {
        return camionesDao.findById(id);
    }

    public Camion save(Camion t) {
        return camionesDao.save(t);
    }

    public void delete(Camion t) {
        camionesDao.delete(t);
    }
}
