/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc_u2_tiendainformatica.Entidades;

import java.time.LocalDate;
import pc_u2_tiendainformatica.Exceptions.DomainException;

/**
 *
 * @author mezab
 */
public class ProductoProveedor {
     private final LocalDate fechaAdquisicion;
    private final String productoAsociado;
    private final String proveedorAsociado;

    // Constructor con validaciones
    public ProductoProveedor(LocalDate fechaAdquisicion, String productoAsociado, String proveedorAsociado) {
        if (fechaAdquisicion == null)
            throw new DomainException("La fecha de adquisición no puede ser nula.");
            if (fechaAdquisicion.isAfter(LocalDate.now()))
                throw new DomainException("La fecha de adquisición no puede ser futura.");
                if (productoAsociado == null || productoAsociado.isBlank())
                    throw new DomainException("El producto asociado es obligatorio.");
                    if (proveedorAsociado == null || proveedorAsociado.isBlank())
                        throw new DomainException("El proveedor asociado es obligatorio.");

        this.fechaAdquisicion = fechaAdquisicion;
        this.productoAsociado = productoAsociado;
        this.proveedorAsociado = proveedorAsociado;
    }
//gett

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public String getProductoAsociado() {
        return productoAsociado;
    }

    public String getProveedorAsociado() {
        return proveedorAsociado;
    }
    
}
