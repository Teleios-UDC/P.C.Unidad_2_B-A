package pc_u2_tiendainformatica.domain.services;


import pc_u2_tiendainformatica.domain.model.Producto;
import pc_u2_tiendainformatica.domain.model.Venta;
import pc_u2_tiendainformatica.domain.valueobjects.Cantidad;
import pc_u2_tiendainformatica.domain.valueobjects.Precio;
import pc_u2_tiendainformatica.domain.exceptions.VentaException;
import pc_u2_tiendainformatica.domain.port.out.*;
import pc_u2_tiendainformatica.domain.adapter.out.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
/*
  ServicioDeVenta sera creado para gestionar la realizacion de una venta
  incluyendo la validacion de productos y cantidades el calculo del total de la venta
  la creacion de la entidad Venta y la emision de un evento de dominio ProductoVendido
  
  actualmente este servicio solo simula algunas funcionalidades basicas
  - ojoooo no valida ni actualiza stock reaaal
  - no genera ID dinamicos ni guarda la venta en una base de datos
  - la publicacion del evento de dominio esta simulada mediante un simple print
 
   en un sistema completo se necesitariann estas funcionalidades para asegurar la integridad
   y persistencia de los datos asi como para comunicar los cambios a otros sistemas o modulos
 */
public class ServicioDeVenta {

    private final VentaRepository ventaRepository;
    private final ProductoRepository productoRepository;
    // Firma del metodo del servicio de dominio

    public ServicioDeVenta(VentaRepository ventaRepository, ProductoRepository productoRepository) {
        this.ventaRepository = ventaRepository;
        this.productoRepository = productoRepository;
    }
    
    
    
    public Venta realizarVenta(String clienteId, List<Producto> productos, List<Cantidad> cantidades) {

    //1. Logica de negocio para verificar el inventario y reglas
    //(Aqui se usan los repositorios que simulan la base de datos)
      if (productos == null || productos.isEmpty()) {
            throw new IllegalArgumentException("La lista de productos no puede estar vacía");
        }
            if (cantidades == null || cantidades.isEmpty()) {
                throw new IllegalArgumentException("La lista de cantidades no puede estar vacía");
            }
    // Validar que ambas listas tengan la misma cantidad de elementos

                if (productos.size() != cantidades.size()) {
                    throw new IllegalArgumentException("La cantidad de productos y cantidades debe ser igual");
                }


    //2. Orquestar cambios en multiples entidades
    //(Aqui iran cambios como por ejemplo, "Actualizar Stock") (SIMULADO)
    
    //3. Crear y Registar la transaccion de venta.
    
    // Calcular el total de la venta multiplicando precio por cantidad
        double totalValor = 0;
        for (int i = 0; i < productos.size(); i++) {
            // Obtenengamos el producto
            Producto producto = productos.get(i);
            // Obtener la cantidad 
            Cantidad cantidad = cantidades.get(i);
            totalValor += producto.getPrecio().getValor() * cantidad.getCantidad();
        }
        // Crearemos el objeto Precio con el total calculado
        Precio total = new Precio(totalValor);
        // Crear la venta y Persistencia del Agregado venta
        String idVenta = "V-" + UUID.randomUUID().toString().substring(0,8);
        
        Venta venta = new Venta(idVenta, clienteId, LocalDate.now(),total);
        
        Venta ventaGuardada = this.ventaRepository.salvar(venta);
        
            
    //4. Publicar un evento de Dominio
    //(El evento de dominio que tenemos que es ProductoVendido)
    
    System.out.println("Evento ProductoVendido emitido para la venta: " + venta.getIdVenta());

    //5. Retornar el resultado de la operacion
    //(La venta ha sido Creada)
    return ventaGuardada;
}
}
