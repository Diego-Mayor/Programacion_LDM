package POO.Geolocalizacion;

public final class RastreoVehiculo {

    private final Ubicacion ubicacion;
    private final String timeStamp;
    private final Vehiculo vehiculo; // guardado como copia

    public RastreoVehiculo(Ubicacion ubicacion, String timeStamp, Vehiculo vehiculo) {
        this.ubicacion = ubicacion;
        this.timeStamp = timeStamp;

        // COPIA DEFENSIVA
        this.vehiculo = new Vehiculo(vehiculo.getMatricula(), vehiculo.getKilometros());
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    // devolver copia para que no puedan mutarlo desde fuera
    public Vehiculo getVehiculo() {
        return new Vehiculo(vehiculo.getMatricula(), vehiculo.getKilometros());
    }

    @Override
    public String toString() {
        return "RastreoVehiculo{" +
                "ubicacion=" + ubicacion +
                ", timeStamp='" + timeStamp + '\'' +
                ", vehiculo=" + vehiculo +
                '}';
    }
}
