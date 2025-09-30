/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc_u2_tiendainformatica.domain.valueobjects;

/**
 *
 * @author mezab
 */
public class Cantidad {
        private final int valor;

    public Cantidad(int valor) {
        if (valor <= 1) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que 0");
        }
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}

