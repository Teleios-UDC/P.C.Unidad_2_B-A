package pc_u2_tiendainformatica.domain.model;

import pc_u2_tiendainformatica.domain.exceptions.*;
import pc_u2_tiendainformatica.domain.valueobjects.*;
import java.time.LocalDate;
import java.util.List;

public class Venta {

    // id 
    private String idVenta;

    private final String clienteId;
    private LocalDate fecha;
    private Precio precio;

    // constructor con validaciones
    public Venta(String idVenta, String clienteId, LocalDate fecha, Precio total) {
        if (idVenta == null || idVenta.isBlank()) {
            throw new VentaException("El ID de la venta no puede estar vacio");
        }
            if (clienteId == null || clienteId.isBlank()) {
                throw new VentaException("El ID del cliente no puede estar vacio");
            }
                if (fecha == null) {
                    throw new VentaException("La fecha de la venta no puede ser nula");
                }
                    if (total == null) {
                        throw new VentaException("El total de la venta no puede ser nulo");
                    }

        // asigna los valores validos a los atributos
        this.idVenta = idVenta;
        this.clienteId = clienteId;
        this.fecha = fecha;
        this.precio = total;
    }

    // getters para acceder a los atributos
    public String getIdVenta() {
        return idVenta;
    }

    public String getClienteId() {
        return clienteId;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Precio getPrecio() {
        return precio;
    }

    // metodo para calcular el total de la venta usando la lista de productos
    public void calcularTotal(List<Producto> productos) {
        if (productos == null || productos.isEmpty()) {
            throw new VentaException("No puede estar vacio");
        }
        double valorTotal = 0;
        for (Producto p : productos) {
            valorTotal += p.getPrecio().getValor();
        }

        // asigna el total calculado al Value Object precio
        this.precio = new Precio(valorTotal);
    }
}