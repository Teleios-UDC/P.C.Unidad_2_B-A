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
public class InMemoryServicioTecnicoRepository {
    private final Map<String, ServicioTecnico> storage = new HashMap<>();

    
    public ServicioTecnico save(ServicioTecnico servicio) {
        storage.put(servicio.getIdServicio(), servicio);
        System.out.println("ADAPTER: Servicio Técnico " + servicio.getIdServicio() + " registrado en memoria.");
        return servicio;
    }    
}
