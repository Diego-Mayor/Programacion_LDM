package POO.Geolocalizacion;

import java.time.LocalDateTime;

public class DemoGeolocalizacion {

    public static void main(String[] args) {

        Ubicacion u = new Ubicacion(150.5, 40.4168);

        Vehiculo v = new Vehiculo("1234ABC", 1000);

        String timeStamp = LocalDateTime.now().toString();

        RastreoVehiculo rastreo = new RastreoVehiculo(u, timeStamp, v);

        // mutaciones externas (NO deben afectar a rastreo)
        v.setKilometros(999999);
        v.setMatricula("ZZZZ999");
        timeStamp = "CAMBIADO";

        System.out.println("RastreoVehiculo (debe mantenerse igual):");
        System.out.println(rastreo);

        System.out.println("\nVehiculo ORIGINAL (mutado):");
        System.out.println(v);

        System.out.println("\nTimeStamp local (mutado): " + timeStamp);
    }
}
