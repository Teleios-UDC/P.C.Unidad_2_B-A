//package pc_u2_tiendainformatica.domain.port.in.mapper;
//
//
//import java.time.LocalDate;
//import java.util.List;
//import java.util.stream.Collectors;
//
///**
// * Mapeador que actúa como Capa Anti-Corrupción para traducir las peticiones
// * externas (DTO) a Comandos de la Capa de Aplicación.
// */
//public final class VentaMapper {
//
//    // Se asume la existencia de una excepción específica si la traducción falla
//    public static class MapperException extends RuntimeException {
//        public MapperException(String message) {
//            super(message);
//        }
//    }
//
//    /**
//     * TRADUCCIÓN DE ENTRADA: DTO EXTERNO → COMANDO DE APLICACIÓN
//     */
//    public static RegistrarVentaCommand toRegistrarVentaCommand(VentaRequestDTO requestDTO) {
//        
//        // 1. Validación de DTO (Invariantes del DTO, no del Dominio)
//        if (requestDTO.getClienteId() == null || requestDTO.getClienteId().trim().isEmpty()) {
//            throw new MapperException("El ID del cliente no puede ser nulo o vacío en la solicitud.");
//        }
//        if (requestDTO.getItems() == null || requestDTO.getItems().isEmpty()) {
//            throw new MapperException("La venta debe contener al menos un producto.");
//        }
//
//        // 2. Mapear la lista de ítems usando Streams de Java
//        List<ItemVentaCommand> itemsComando = requestDTO.getItems().stream()
//            .map(VentaMapper::toItemVentaCommand)
//            .collect(Collectors.toList());
//
//        // 3. Construir el Comando Principal
//        return new RegistrarVentaCommand(
//            requestDTO.getClienteId(), 
//            itemsComando,
//            LocalDate.now() // La fecha de la transacción se establece al momento del mapeo
//        );
//    }
//
//    /**
//     * Función auxiliar para mapear ítems individuales
//     */
//    private static ItemVentaCommand toItemVentaCommand(ItemVentaDTO itemDTO) {
//        if (itemDTO.getProductoId() == null || itemDTO.getCantidad() <= 0) {
//            throw new MapperException("El ítem de venta es inválido: ID de producto nulo o cantidad menor a 1.");
//        }
//        
//        return new ItemVentaCommand(
//            itemDTO.getProductoId(),
//            itemDTO.getCantidad()
//        );
//    }
//}