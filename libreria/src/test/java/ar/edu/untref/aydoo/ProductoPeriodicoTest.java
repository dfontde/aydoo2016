package ar.edu.untref.aydoo;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class ProductoPeriodicoTest {

    @Test
    public void elPrecioDevueltoDeUnProductoPeriodicoNoIncluyeIVA() {

        BigDecimal precioSinIVA = new BigDecimal("15.00");
        Producto diarioPagina12 = new ProductoPeriodico("Pagina 12", precioSinIVA, Periodicidad.DIARIA);

        BigDecimal precioSinIVAObtenido = diarioPagina12.getPrecio();

        Assert.assertEquals(precioSinIVA, precioSinIVAObtenido);

    }

}
