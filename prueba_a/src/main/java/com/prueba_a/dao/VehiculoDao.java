/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prueba_a.dao;

import com.prueba_a.domain.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Derek
 */
public interface VehiculoDao extends JpaRepository<Vehiculo,Long>{
    
}
