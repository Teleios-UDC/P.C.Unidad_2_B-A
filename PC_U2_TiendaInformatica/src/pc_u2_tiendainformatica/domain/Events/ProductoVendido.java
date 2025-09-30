/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc_u2_tiendainformatica.domain.Events;

/**
 *
 * @author mezab
 */

import java.time.LocalDate;

public class ProductoVendido {

    private final String productoId;
    private final String clienteId;
    private final int cantidad;
    private final LocalDate fecha;

        public ProductoVendido(String productoId, String clienteId, int cantidad, LocalDate fecha) {
            this.productoId = productoId;
            this.clienteId = clienteId;
            this.cantidad = cantidad;
            this.fecha = fecha;
    }

        // Getters
        public String getProductoId() {
            return productoId;
        }

        public String getClienteId() {
            return clienteId;
        }

        public int getCantidad() {
            return cantidad;
        }

        public LocalDate getFecha() {
            return fecha;
        }

    

   @Override
    public String toString() {
        return "ProductoVendido{" + "ID del producto=" + productoId + ", ID cliente" + clienteId + ", cantidad" + cantidad + ", fecha" + fecha + '}';
    }
    
}
