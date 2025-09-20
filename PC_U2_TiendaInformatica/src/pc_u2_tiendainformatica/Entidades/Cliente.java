/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc_u2_tiendainformatica.Entidades;

import pc_u2_tiendainformatica.Exceptions.DomainException;


public class Cliente {
  
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;

    // CoOnstructor con validaciones 
    public Cliente(String nombre, String apellido, String correo, String telefono) {
        
            if (nombre == null || nombre.isBlank())
                throw new DomainException("El nombre es obligatorio.");
                if (apellido == null || apellido.isBlank())
                    throw new DomainException("El apellido es obligatorio.");
                    if (correo == null || !correo.contains("@"))
                        throw new DomainException("El correo electrónico no es válido.");
                        if (telefono == null || telefono.isBlank())
                        throw new DomainException("El teléfono es obligatorio.");

        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    // Métodos para actualizar datos con validación
    public void RenameCliente(String nuevoNombre) {
        if (nuevoNombre == null || nuevoNombre.isBlank())
            throw new DomainException("El nombre no puede estar vacío.");
        this.nombre = nuevoNombre;
    }
    // Gett
            public String getNombre() {
                return nombre;
            }

            public String getApellido() {
                return apellido;
            }

            public String getCorreo() {
                return correo;
            }

            public String getTelefono() {
                return telefono;
            }

   
    
}
