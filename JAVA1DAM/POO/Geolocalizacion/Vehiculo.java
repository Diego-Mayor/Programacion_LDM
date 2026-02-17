package POO.Geolocalizacion;

public class Vehiculo {

    private String matricula;
    private double kilometros;

    public Vehiculo(String matricula, double kilometros) {
        this.matricula = matricula;
        this.kilometros = kilometros;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    @Override
    public String toString() {
        return "Vehiculo{matricula='" + matricula + "', kilometros=" + kilometros + "}";
    }
}
