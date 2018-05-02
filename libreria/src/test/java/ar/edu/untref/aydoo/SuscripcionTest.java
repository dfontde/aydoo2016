package ar.edu.untref.aydoo;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class SuscripcionTest {

    @Test
    public void tipoDeSuscripcionAnualObtiene20PorCientoDeDescuento() {

        ProductoPeriodico revistaElGrafico = new ProductoPeriodico("Revista El Grafico",
                new java.math.BigDecimal("30.00"), Periodicidad.MENSUAL);
        Producto suscripcionAnualARevistaElGrafico = new Suscripcion("Suscripcion anual a Revista El Grafico",
                revistaElGrafico, TipoSuscripcion.ANUAL);
        BigDecimal precioSuscripcionEsperado = new BigDecimal("24.00");

        BigDecimal precioSuscripcionObtenido = suscripcionAnualARevistaElGrafico.getPrecio();

        Assert.assertEquals(precioSuscripcionEsperado, precioSuscripcionObtenido);

    }

    @Test
    public void tipoDeSuscripcionMensualNoObtieneDescuento() {

        ProductoPeriodico diarioClarin = new ProductoPeriodico("Diario Clarin", new java.math.BigDecimal("12.00"),
                Periodicidad.DIARIA);
        Producto suscripcionMensualADiarioClarin = new Suscripcion("Suscripcion mensual a Diario Clarin", diarioClarin,
                TipoSuscripcion.MENSUAL);
        BigDecimal precioSuscripcionEsperado = new BigDecimal("360.00");

        BigDecimal precioSuscripcionObtenido = suscripcionMensualADiarioClarin.getPrecio();

        Assert.assertEquals(precioSuscripcionEsperado, precioSuscripcionObtenido);

    }

}
