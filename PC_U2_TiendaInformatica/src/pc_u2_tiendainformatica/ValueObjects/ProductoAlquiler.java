
package pc_u2_tiendainformatica.ValueObjects;

//Usamos final para mantener el diseño de dominio
public final class ProductoAlquiler {
    private final int horasAlquiler;
    //Creamos nuestro constructor
    public ProductoAlquiler(int horasAlquiler) {
        //Un if que nos diga que horasAlquiler no puede ser menor o igual a 0
        if (horasAlquiler <= 0) {
            throw new IllegalArgumentException("Las horas de alquiler deben ser mayores a cero");
        }
        this.horasAlquiler = horasAlquiler;
    }

    //GET
    public int getHorasAlquier() {
        return horasAlquiler;
    }
    
    
    
}
