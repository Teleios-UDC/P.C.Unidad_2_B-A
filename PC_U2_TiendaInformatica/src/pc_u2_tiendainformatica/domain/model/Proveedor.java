/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc_u2_tiendainformatica.domain.model;

import pc_u2_tiendainformatica.domain.exceptions.DomainException;


public class Proveedor {
    private final String idProveedor; 
    private final String nif;         
    private String direccion;

    // Constructor con validaciones (invariantes de negocio)
    public Proveedor(String idProveedor, String nif, String direccion) {
        if (idProveedor == null || idProveedor.isBlank())
            throw new DomainException("El ID del proveedor no puede estar vacío.");
            if (nif == null || nif.isBlank())
                throw new DomainException("El NIF del proveedor no puede estar vacío.");
                if (direccion == null || direccion.isBlank())
                    throw new DomainException("La dirección del proveedor es obligatoria.");

        this.idProveedor = idProveedor;
        this.nif = nif;
        this.direccion = direccion;
    }

    // Métodos para actualizar datos con validación
    public void cambiarDireccion(String nuevaDireccion) {
        if (nuevaDireccion == null || nuevaDireccion.isBlank())
            throw new DomainException("La dirección no puede estar vacía.");
        this.direccion = nuevaDireccion;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public String getNif() {
        return nif;
    }

    public String getDireccion() {
        return direccion;
    }
    
}
