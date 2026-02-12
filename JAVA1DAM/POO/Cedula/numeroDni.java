package POO.Cedula;

public class numeroDni {
    private int numeroDni;

    public void setnumeroDni(int numeroDni) {
        this.numeroDni = numeroDni;
    }

    public int getnumeroDni() {
        return numeroDni;
    }

    public int calcularLetraDni(){
        return numeroDni / 23;
    }


    public static  char[] letra(){
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    }
}
