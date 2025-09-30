/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc_u2_tiendainformatica.domain.port.out;

import pc_u2_tiendainformatica.domain.model.*;
import pc_u2_tiendainformatica.domain.exceptions.*;
/**
 *
 * @author Mitzuke
 */
public interface ProductoRepository {
    Producto buscarId(String idProducto) throws ProductoException;
    
    Producto salvar(Producto producto);
    
    
    Boolean codigoExistente(String codigo);
}
