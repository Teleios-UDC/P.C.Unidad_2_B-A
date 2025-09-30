/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc_u2_tiendainformatica.domain.adapter.out;

import pc_u2_tiendainformatica.domain.model.*;
import pc_u2_tiendainformatica.domain.exceptions.*;
import pc_u2_tiendainformatica.domain.port.out.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mitzuke
 */
public class InMemoryVentaRepository {
    private final Map<String, Venta> storage = new HashMap<>();
    
    public Venta save(Venta venta) {
        if (venta.getIdVenta() == null || venta.getIdVenta().isBlank()) {
            throw new VentaException("El ID de venta debe ser generado por el servicio");
        }
        storage.put(venta.getIdVenta(), venta);
        System.out.println("ADAPTER: Venta "+venta.getIdVenta()+" guardada en memoria");
        return venta;
    }
    public Venta buscarId(String idVenta) throws VentaException {
        if (!storage.containsKey(idVenta)) {
            throw new VentaException("No se encontró la venta con ID: " + idVenta);
        }
        return storage.get(idVenta);
    }
}
