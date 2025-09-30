/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc_u2_tiendainformatica.domain.model;

import pc_u2_tiendainformatica.domain.Enum.*;
import pc_u2_tiendainformatica.domain.valueobjects.*;
import pc_u2_tiendainformatica.domain.exceptions.ProductoException;
/**
 *
 * @author Mitzuke
 */
public class ProductoFactory {
    public static Producto crear(
    String idProducto,
    String codigo,
    String nombre,
    String modelo,
    String descripcion,
    CategoriaEnum categoria,
    DisponibilidadAlquilerEnum disponibleAlquiler,
    Precio precio,
    ProductoAlquiler alquiler,
    ProductoAltaTecnologia altaTecnologia) {
        
        //Aqui pondriamos validaciones para que nos iga si el codigo ya existe.
        
        return new Producto(
        idProducto,
        nombre,
        categoria,
        modelo,
        descripcion,
        codigo,
        precio,
        disponibleAlquiler,
        alquiler,
        altaTecnologia
        );
    }

    
    
}
