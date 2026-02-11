package POO.Hora;


public class Reloj {
    private int h;
    private int m;
    private int s;


    public Reloj() {
        h = 0;
        m = 0;
        s = 0;


    }


    public Reloj(int h, int m, int s) {
        if (h >= 0 && h <= 23) {
            this.h = h;
        }else{
            System.out.println("Error fuera de rango de la hora");
        }

         if (m >= 0 && m <= 59) {
             this.m = m;
         }else{
            System.out.println("Error numero fuera de rango de los mminutos");
         }

          if (s >= 0 && s <= 59) {
           this.s = s;
          }else{
            System.out.println("Error fuera de rango de los minutos.");
          }

    }

    public String dimeLaHora(){
      return h + ":" + m + ":" + s;
    }

    public void imprimir(){
        System.out.println("Reloj - " + h + ":" + m + ":" + s);
    }

    public void setReloj(int h, int m, int s) {
    if (h >= 0 && h <= 23 &&
        m >= 0 && m <= 59 &&
        s >= 0 && s <= 59) {

        this.h = h;
        this.m = m;
        this.s = s;

    } else {
        System.out.println("Error: valores fuera de rango.");
    }
}

    public int getH() {
        return h;
    }


    public void setH(int h) {
         if (h >= 0 && h <= 23) {
            this.h = h;
        }else{
            System.out.println("Error fuera de rango de la hora");
        }
    }


    public int getM() {
        return m;
    }


    public void setM(int m) {
       if (m >= 0 && m <= 59) {
             this.m = m;
         }else{
            System.out.println("Error numero fuera de rango de los mminutos");
         }
    }


    public int getS() {
        return s;
    }


    public void setS(int s) {
        if (s >= 0 && s <= 59) {
           this.s = s;
          }else{
            System.out.println("Error fuera de rango de los minutos.");
        }
    }

}
