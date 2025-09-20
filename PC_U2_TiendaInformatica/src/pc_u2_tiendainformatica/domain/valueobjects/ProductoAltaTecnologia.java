
package pc_u2_tiendainformatica.domain.valueobjects;
//importamos LocalDate, ya que tenemos un atributo que usara fecha
import java.time.LocalDate;
//Usamos final, para mantener mejor el diseño de dominio
public final class ProductoAltaTecnologia {
    private final String paisOrigen;
    private final LocalDate fechaFabricacion;
    //Creamos oconstructor, en este caso con dos if
    public ProductoAltaTecnologia(String paisOrigen, LocalDate fechaFabricacion) {
        //este if nos dira, que si PaisOrigen es null o esta vacio, nos muestre un mensaje de error
        if (paisOrigen == null || paisOrigen.trim().isEmpty()) {
            throw new IllegalArgumentException("El pais de origen no puede estar vacio");
        }
        //Este if nos dira que si fechaFabricacion es despues de la fecha actual, nos marcara un error
        if (fechaFabricacion == null || fechaFabricacion.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha no puede ser futura.");
        }
        this.paisOrigen = paisOrigen;
        this.fechaFabricacion = fechaFabricacion;
    }

    //GETTERS
    public String getPaisOrigen() {
        return paisOrigen;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }
    
    
    
}
