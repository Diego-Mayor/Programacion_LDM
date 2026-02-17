package POO.Geolocalizacion;

public final class Ubicacion {

    private final double altitud;
    private final double latitud;

    public Ubicacion(double altitud, double latitud) {
        this.altitud = altitud;
        this.latitud = latitud;
    }

    public double getAltitud() {
        return altitud;
    }

    public double getLatitud() {
        return latitud;
    }

    @Override
    public String toString() {
        return "Ubicacion{altitud=" + altitud + ", latitud=" + latitud + "}";
    }
}
