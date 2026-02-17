package POO.Santander;


import java.time.LocalDateTime;

public class Movimiento {

    public enum Tipo {
        INGRESO, RETIRADA, TRANSFERENCIA_ENTRANTE, TRANSFERENCIA_SALIENTE
    }

    private final Tipo tipo;
    private final double importe;
    private final LocalDateTime fechaHora;
    private final String detalle;

    public Movimiento(Tipo tipo, double importe, String detalle) {
        this.tipo = tipo;
        this.importe = importe;
        this.detalle = detalle;
        this.fechaHora = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return fechaHora + " | " + tipo + " | " + importe + "€ | " + detalle;
    }
}
