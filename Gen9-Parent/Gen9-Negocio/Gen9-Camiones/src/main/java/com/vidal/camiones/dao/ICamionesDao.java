package com.vidal.camiones.dao;

import com.vidal.camiones.models.Camion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICamionesDao extends JpaRepository <Camion,Long> {

}
