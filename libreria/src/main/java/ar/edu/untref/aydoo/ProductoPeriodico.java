package ar.edu.untref.aydoo;

import java.math.BigDecimal;

public class ProductoPeriodico extends Producto {

    private Periodicidad periodicidad;

    public ProductoPeriodico(String descripcion, BigDecimal precio, Periodicidad periodicidad) {
        super(descripcion, precio);
        this.periodicidad = periodicidad;
    }

    public Periodicidad getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(Periodicidad periodicidad) {
        this.periodicidad = periodicidad;
    }

}
