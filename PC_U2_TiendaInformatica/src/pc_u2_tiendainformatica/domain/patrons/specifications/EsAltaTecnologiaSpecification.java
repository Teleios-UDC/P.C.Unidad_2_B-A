/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc_u2_tiendainformatica.domain.patrons.specifications;
import pc_u2_tiendainformatica.domain.Enum.*;
import pc_u2_tiendainformatica.domain.model.*;
import pc_u2_tiendainformatica.domain.patrons.specifications.*;


/**
 *
 * @author Mitzuke
 */
public class EsAltaTecnologiaSpecification implements Specification<Producto> {
    @Override
    public boolean isSatisfiedBy(Producto producto) {
        CategoriaEnum cat = producto.getCategoria();
        return cat == CategoriaEnum.CPU || cat == CategoriaEnum.DISCO_DURO;
    }
}
