package POO.Hora;

public class Reloj {
    private int h;
    private int m;
    private int s;

    // Constructor sin parámetros -> 0:0:0
    public Reloj() {
        this.h = 0;
        this.m = 0;
        this.s = 0;
    }

    // Constructor con parámetros (valida todo junto)
    public Reloj(int h, int m, int s) {
        setReloj(h, m, s);
    }

    // Getter y Setter de hora
    public int getH() {
        return h;
    }

    public void setH(int h) {
        if (h >= 0 && h <= 23) {
            this.h = h;
        } else {
            System.out.println("Error: hora fuera de rango (0-23).");
        }
    }

    // Getter y Setter de minuto
    public int getM() {
        return m;
    }

    public void setM(int m) {
        if (m >= 0 && m <= 59) {
            this.m = m;
        } else {
            System.out.println("Error: minutos fuera de rango (0-59).");
        }
    }

    // Getter y Setter de segundo
    public int getS() {
        return s;
    }

    public void setS(int s) {
        if (s >= 0 && s <= 59) {
            this.s = s;
        } else {
            System.out.println("Error: segundos fuera de rango (0-59).");
        }
    }

    // Setter triple
    public void setReloj(int h, int m, int s) {
        if (h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59) {
            this.h = h;
            this.m = m;
            this.s = s;
        } else {
            System.out.println("Error: valores fuera de rango (h 0-23, m 0-59, s 0-59).");
            // opcional: dejarlo en 0:0:0 si quieres forzar un estado válido
            this.h = 0;
            this.m = 0;
            this.s = 0;
        }
    }

    // Devuelve hora en 24h (String)
    public String dimeHora() {
        return h + ":" + m + ":" + s;
    }

    // Devuelve hora en 12h (String)
    public String dimeHora12() {
        int hora12;
        String periodo;

        if (h == 0) {
            hora12 = 12;
            periodo = "am";
        } else if (h < 12) {
            hora12 = h;
            periodo = "am";
        } else if (h == 12) {
            hora12 = 12;
            periodo = "pm";
        } else {
            hora12 = h - 12;
            periodo = "pm";
        }

        return hora12 + periodo + ":" + m + ":" + s;
    }

    // Imprime hora 24h usando dimeHora()
    public void imprimeHora() {
        System.out.println(dimeHora());
    }

    // Imprime hora 12h usando dimeHora12()
    public void imprimeHora12() {
        System.out.println(dimeHora12());
    }

    // Tick: avanza 1 segundo
    public void tick() {
        s++;

        if (s == 60) {
            s = 0;
            m++;
        }

        if (m == 60) {
            m = 0;
            h++;
        }

        if (h == 24) {
            h = 0;
        }
    }
}
