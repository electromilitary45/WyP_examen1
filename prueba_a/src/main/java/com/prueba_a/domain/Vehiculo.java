/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba_a.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Derek
 */

@Data
@Entity
@Table(name="vehiculo")
public class Vehiculo implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehiculo;
    
    private String descripcion;
    private String fechaSalida;
    private int cilindros;

    public Vehiculo() {
    }

    public Vehiculo(Long idVehiculo, String descripcion, String fechaSalida, int cilindros) {
        this.idVehiculo = idVehiculo;
        this.descripcion = descripcion;
        this.fechaSalida = fechaSalida;
        this.cilindros = cilindros;
    }
    
}
