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
 * @author mezab
 */

import java.util.HashMap;
import java.util.Map;

public class InMemoryClienteRepository implements ClienteRepository {

    // Este adaptador simula un repositorio de clientes en memoria
    private final Map<String, Cliente> storage = new HashMap<>();

    @Override
    // Guarda un cliente en memoria
    public Cliente salvar(Cliente cliente) {
              if (cliente == null || cliente.getIdCliente() == null || cliente.getIdCliente().isBlank()) {
            throw new ClienteException("El ID del cliente debe estar definido");
        }
        storage.put(cliente.getIdCliente(), cliente);
         System.out.println("ADAPTER Cliente " + cliente.getIdCliente() + " guardado");
                return cliente;
    }

    @Override
    // Busca un cliente en memoria por id
    public Cliente buscarPorId(String idCliente) throws ClienteException {
            Cliente c = storage.get(idCliente);
                if (c == null) {
                 throw new ClienteException("No se encontro el cliente con ID " + idCliente);
        }
                    return c;
    }
}