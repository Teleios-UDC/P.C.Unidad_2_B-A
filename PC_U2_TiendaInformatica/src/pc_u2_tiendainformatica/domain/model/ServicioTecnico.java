/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc_u2_tiendainformatica.domain.model;

import java.time.LocalDate;
import pc_u2_tiendainformatica.domain.exceptions.DomainException;


public class ServicioTecnico {
    // Identidad compuesta
    private final String idCliente;
    private final String idProducto;

    // Atributos propios de la relación
    private String detallesServicio;
    private LocalDate fecha;
    
  

    // Constructor con validación
    public ServicioTecnico(String idCliente, String idProducto, String detallesServicio, LocalDate fecha) {
        if (idCliente == null || idCliente.isBlank())
                throw new DomainException("El ID de Cliente no puede estar vacío");
            if (idProducto == null || idProducto.isBlank())
                    throw new DomainException("El ID de Producto no puede estar vacío");
                if (detallesServicio == null || detallesServicio.isBlank())
                        throw new DomainException("Los detalles del servicio no pueden estar vacíos");
                    if (fecha == null)
                            throw new DomainException("La fecha no puede ser nula");

        this.idCliente = idCliente;
        this.idProducto = idProducto;
        this.detallesServicio = detallesServicio;
        this.fecha = fecha;
    }

    // Métodos 
 
    public void actualizarDetalles(String nuevosDetalles) {
        if (nuevosDetalles == null || nuevosDetalles.isBlank())
                throw new DomainException("Los detalles del servicio no pueden estar vacíos");
                    this.detallesServicio = nuevosDetalles;
    }

    public void reprogramarFecha(LocalDate nuevaFecha) {
        if (nuevaFecha == null)
                throw new DomainException("La nueva fecha no puede ser nula");
                    this.fecha = nuevaFecha;
    }

        // Get
        public String getIdCliente() {
            return idCliente;
        }
        public String getIdProducto() {
            return idProducto;
        }
        public String getDetallesServicio() {
            return detallesServicio;
        }
        public LocalDate getFecha() {
            return fecha;
        }

   
}