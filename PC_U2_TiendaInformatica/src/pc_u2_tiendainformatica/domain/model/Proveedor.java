/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc_u2_tiendainformatica.domain.model;

import pc_u2_tiendainformatica.domain.exceptions.DomainException;


public class Proveedor {
    private String idProveedor;
    private String NIF;
    private String direccion; 

    public Proveedor(String idProveedor, String NIF, String direccion) {
        if (idProveedor == null || idProveedor.isBlank())
            throw new DomainException ("El ID del proveedor no puede ser vacio."); 
            if (NIF == null || NIF.isBlank())
                throw new DomainException("El nif del proveedor no puede ser vacio");
                if (direccion == null || direccion.isBlank())
                    throw new DomainException("El nif del proveedor no puede ser vacio");
        this.idProveedor = idProveedor;
        this.NIF = NIF;
        this.direccion = direccion;
    }
    
    //metodos 
    
    public void ActuaizarNIF (String NIF){
    if (NIF == null || NIF.isBlank())
        throw new DomainException ("El nif del proveedor no puede ser vacio");
             this.NIF = NIF;
    }
    
    public void ActuaizarDireccion (String direccion){
    if (direccion == null || direccion.isBlank())
        throw new DomainException ("La direcciion del proveedor no puede ser vacio");
             this.direccion = direccion;
    }
    
    public String getIdProveedor() {
        return idProveedor;
    }

    public String getNIF() {
        return NIF;
    }

    public String getDireccion() {
        return direccion;
    }
    
    
}