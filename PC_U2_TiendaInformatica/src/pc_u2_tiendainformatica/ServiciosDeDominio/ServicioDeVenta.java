package pc_u2_tiendainformatica.ServiciosDeDominio;
import pc_u2_tiendainformatica.Entidades.Venta;

public class ServicioDeVenta {
    
    
    // Firma del metodo del servicio de dominio
    
    public Venta realizarVenta(
        String clienteId
        List<ItemVenta> itemsVenta
    ) {
    //1. Logica de negocio para verificar el inventario y reglas
    //(Aqui se usan los repositorios que simulan la base de datos)
    
    //2. Orquestar cambios en multiples entidades
    //(Aqui iran cambios como por ejemplo, "Actualizar Stock")
    
    //3. Crear y Registar la transaccion de venta.
    
    //4. Publicar un evento de Dominio
    //(El evento de dominio que tenemos que es ProductoVendido)
    
    //5. Retornar el resultado de la operacion
    //(La venta ha sido Creada)
    return venta;
}
}
