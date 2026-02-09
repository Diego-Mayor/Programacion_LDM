package POO.CChe;

public class Coche {

    private String modelo;
    private String color;
    private String matricula;
    private TipoCoche tipoCoche;
    private int añoFabricacion;
    private boolean metalizada;
    private ModalidadSeguro modalidadSeguro;

    public Coche(String modelo, String color, String matricula,
                 TipoCoche tipoCoche, int añoFabricacion,
                 boolean metalizada, ModalidadSeguro modalidadSeguro) {

        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.tipoCoche = tipoCoche;
        this.añoFabricacion = añoFabricacion;
        this.metalizada = metalizada;
        this.modalidadSeguro = modalidadSeguro;
    }

    

    @Override
    public String toString() {
        return "Coche modelo: " + modelo + ", color: " + color + ", matricula: " + matricula + ", tipoCoche: " + tipoCoche
                + ", añoFabricacion: " + añoFabricacion + ", metalizada: " + metalizada + ", modalidadSeguro: "
                + modalidadSeguro;
    }

    public void imprimir(){
        System.out.println(toString());
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public TipoCoche getTipoCoche() {
        return tipoCoche;
    }

    public void setTipoCoche(TipoCoche tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public boolean isMetalizada() {
        return metalizada;
    }

    public void setMetalizada(boolean metalizada) {
        this.metalizada = metalizada;
    }

    public ModalidadSeguro getModalidadSeguro() {
        return modalidadSeguro;
    }

    public void setModalidadSeguro(ModalidadSeguro modalidadSeguro) {
        this.modalidadSeguro = modalidadSeguro;
    }
    
}
