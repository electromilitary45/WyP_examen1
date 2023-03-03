/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba_a.service;

import com.prueba_a.dao.VehiculoDao;
import com.prueba_a.domain.Vehiculo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Derek
 */
@Service
public class VehiculoServiceImpl implements VehiculoService{

    @Autowired
    private VehiculoDao vehiculoDao;
    
    @Override
    public List<Vehiculo> getVehiculo() {
        return (List<Vehiculo>) vehiculoDao.findAll();
    }

    @Override
    public Vehiculo getVehiculo(Vehiculo vehiculo) {
        return vehiculoDao.findById(vehiculo.getIdVehiculo()).orElse(null);
    }

    @Override
    public void deleteVehiculo(Vehiculo vehiculo) {
        vehiculoDao.delete(vehiculo);
    }

    @Override
    public void saveVehiculo(Vehiculo vehiculo) {
        vehiculoDao.save(vehiculo);
    }
    
}
