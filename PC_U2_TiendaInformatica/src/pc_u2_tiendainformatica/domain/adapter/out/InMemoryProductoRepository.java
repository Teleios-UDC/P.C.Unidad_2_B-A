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
public class InMemoryProductoRepository {
        private final Map<String, Producto> storage = new HashMap<>();

    
    public Producto buscarId(String idProducto) throws ProductoException {
        if (!storage.containsKey(idProducto)) {
            throw new ProductoException("No se encontró el producto con ID: " + idProducto);
        }
        return storage.get(idProducto);
    }

    
    public Producto salvar(Producto producto) {
        storage.put(producto.getIdProducto(), producto);
        System.out.println("ADAPTER: Producto " + producto.getCodigo() + " guardado en memoria.");
        return producto;
    }

    
    public boolean codigoExistente(String codigo) {
        return storage.values().stream()
                      .anyMatch(p -> p.getCodigo().equalsIgnoreCase(codigo));
    }
}
