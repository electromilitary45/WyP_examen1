/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba_a.service;

import com.prueba_a.domain.Vehiculo;
import java.util.List;

/**
 *
 * @author Derek
 */
public interface VehiculoService {
    
    public List<Vehiculo> getVehiculo();
    
    public Vehiculo getVehiculo(Vehiculo vehiculo);
    
    public void deleteVehiculo(Vehiculo vehiculo);
    
    public void saveVehiculo(Vehiculo vehiculo);
    
}
