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
public interface VentaRepository {
    //Guarda una nueva venta
    Venta salvar(Venta venta);
    
    //Recupera venta por ID
    Venta BuscarId(String idVenta) throws VentaException;
    
}
