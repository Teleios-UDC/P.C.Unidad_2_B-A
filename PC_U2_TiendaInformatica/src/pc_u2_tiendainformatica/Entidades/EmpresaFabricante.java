/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc_u2_tiendainformatica.Entidades;

import pc_u2_tiendainformatica.Exceptions.DomainException;


public class EmpresaFabricante {
     private final int idFabricante;
    private final String nombre;
    private final String direccion;
    private final int numeroEmpleados;

    // Constructor con validaciones (invariantes de negocio)
    public EmpresaFabricante(int idFabricante, String nombre, String direccion, int numeroEmpleados) {
        if (idFabricante <= 0)
            throw new DomainException("El ID del fabricante debe ser mayor que 0.");
            if (nombre == null || nombre.isBlank())
                    throw new DomainException("El nombre del fabricante no puede estar vacío.");
                if (direccion == null || direccion.isBlank())
                    throw new DomainException("La dirección es obligatoria.");
                    if (numeroEmpleados < 0)
                        throw new DomainException("El número de empleados no puede ser negativo.");

        this.idFabricante = idFabricante;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroEmpleados = numeroEmpleados;
    }
//get

    public int getIdFabricante() {
        return idFabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }
        
}
