/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc_u2_tiendainformatica.Entidades;

import java.time.LocalDate;
import pc_u2_tiendainformatica.Exceptions.DomainException;


public class ServicioTecnico {
    private final String detalleServicio;
    private final LocalDate fecha;
    private final String productoAsociado;
    private final String clienteAsociado;

    // Constructor con validaciones (invariantes de negocio)
    public ServicioTecnico(String detalleServicio, LocalDate fecha, String productoAsociado, String clienteAsociado) {
        if (detalleServicio == null || detalleServicio.isBlank())
            throw new DomainException("El detalle del servicio no puede estar vacío.");
            if (fecha == null)
                throw new DomainException("La fecha del servicio es obligatoria.");
                if (fecha.isAfter(LocalDate.now()))
                    throw new DomainException("La fecha del servicio no puede ser futura.");
                    if (productoAsociado == null || productoAsociado.isBlank())
                        throw new DomainException("El producto asociado es obligatorio.");
                        if (clienteAsociado == null || clienteAsociado.isBlank())
                            throw new DomainException("El cliente asociado es obligatorio.");

        this.detalleServicio = detalleServicio;
        this.fecha = fecha;
        this.productoAsociado = productoAsociado;
        this.clienteAsociado = clienteAsociado;
    }
//get

    public String getDetalleServicio() {
        return detalleServicio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getProductoAsociado() {
        return productoAsociado;
    }

    public String getClienteAsociado() {
        return clienteAsociado;
    }
        
}
