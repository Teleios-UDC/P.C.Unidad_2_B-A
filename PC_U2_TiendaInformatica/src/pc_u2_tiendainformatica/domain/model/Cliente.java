/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc_u2_tiendainformatica.domain.model;

import pc_u2_tiendainformatica.domain.exceptions.DomainException;




public class Cliente {

    private String  idCliente; 
    private String nombre;
    private String telefono;
    private String direccion;

    public Cliente(String idCliente, String nombre, String telefono, String direccion) {
        this.idCliente = idCliente; 
        
        if (nombre == null || nombre.isBlank())
            throw new DomainException("El nombre es obligatorio.");
            if (telefono == null || telefono.isBlank())
                throw new DomainException("El teléfono es obligatorio.");
                if (direccion == null || direccion.isBlank())
                    throw new DomainException("La dirección es obligatoria.");
        this.idCliente = idCliente; 
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public void NuevoNombreCliente(String nuevoNombre) {
        if (nuevoNombre == null || nuevoNombre.isBlank())
            throw new DomainException("El nombre no puede estar vacío.");
        this.nombre = nuevoNombre;
    }
    
    public void newTelefono(String nuevoTelefono) {
        if (nuevoTelefono == null || nuevoTelefono.isBlank())
            throw new DomainException("El teléfono no puede estar vacío.");
        this.telefono = nuevoTelefono;
    }
    
    public void newDireccion(String nuevaDireccion) {
        if (nuevaDireccion == null || nuevaDireccion.isBlank())
            throw new DomainException("La dirección no puede estar vacía.");
        this.direccion = nuevaDireccion;
    }

    public String getIdCliente() {
        return idCliente;
    }


    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public String getDireccion() {
        return direccion;
    }
}