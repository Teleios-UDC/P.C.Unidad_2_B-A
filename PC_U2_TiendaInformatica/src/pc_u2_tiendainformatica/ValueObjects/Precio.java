
package pc_u2_tiendainformatica.ValueObjects;
//Segun lo investigado, poner la clase en final no es obligatorio, per el uso de este, 
//permite forzar la inmutabildiad y asegudar el diseño de dominio

public final class Precio {
    // El campo "valor" es final, lo que garantiza que no se pueda cambiar despues de la creacion del objeto haciedo al VO inmutable
    private final double valor;
    //Creamos el constructo, y a este le ponemos una validacion para que "valor" no sea negativo.
    public Precio(double valor) {
    if (valor < 0) {
        //Aqui nos tira un mensaje si "valor" es negativo
        throw new IllegalArgumentException("El precio no puede ser negativo");
    }
    this.valor = valor;
    }

    //Ponemos su GET al atributo "valor"
    public double getValor() {
        return valor;
    }
    
    
}
