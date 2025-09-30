/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc_u2_tiendainformatica.domain.exceptions;

/**
 *
 * @author mezab
 */
public class ProveedorException extends RuntimeException {
    public ProveedorException(String mensaje) {
        super("OJOOO: " +mensaje); 

    }
}