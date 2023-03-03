/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba_a.controller;

import com.prueba_a.domain.Vehiculo;
import com.prueba_a.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Derek
 */
@Controller

public class VehiculoController {
    @Autowired
    private VehiculoService vehiculoService;
    
    //----Ruta por Defecto
    @GetMapping("/")
    public String inicio(Model model){
        var vehiculos=vehiculoService.getVehiculo();
        model.addAttribute("vehiculo",vehiculos);
        return "index";
    }
    
    @GetMapping("/vehiculo/eliminar/{idVehiculo}")
    public String eliminaUsuario(Vehiculo vehiculo){
        vehiculoService.deleteVehiculo(vehiculo);
        return "redirect:/";
    }
    
}
