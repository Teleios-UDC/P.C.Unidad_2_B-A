/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc_u2_tiendainformatica.domain.port.out;
import pc_u2_tiendainformatica.domain.model.*;
import pc_u2_tiendainformatica.domain.exceptions.*;
/**
 *
 * @author mezab
 */

// Esta interfaz define lo que se puede hacer con los clientes
// Es un puerto OUT porque el dominio solo declara lo que necesita
// Aqui decimos que se puede guardar un cliente y buscar un cliente por su id
public interface ClienteRepository {
    Cliente salvar(Cliente cliente);
    Cliente buscarPorId(String idCliente) throws ClienteException;
            
}