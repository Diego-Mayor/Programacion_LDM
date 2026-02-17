package POO.Grafico2D;

import java.util.ArrayList;

public class GraficoLineas2D {

    private ArrayList<Punto> puntos;

    public GraficoLineas2D() {
        puntos = new ArrayList<>();
    }

    public boolean addPunto(Punto p) {

        // Coordenadas positivas
        if (p.getX() <= 0 || p.getY() <= 0) {
            System.out.println("Error: coordenadas deben ser positivas.");
            return false;
        }

        // No repetir posición
        for (Punto pt : puntos) {
            if (pt.getX() == p.getX() && pt.getY() == p.getY()) {
                System.out.println("Error: ya existe un punto en esa posición.");
                return false;
            }
        }

        // Orden creciente en X
        if (!puntos.isEmpty()) {
            Punto ultimo = puntos.get(puntos.size() - 1);
            if (p.getX() < ultimo.getX()) {
                System.out.println("Error: la X debe ser mayor o igual que la anterior.");
                return false;
            }
        }

        puntos.add(p);
        System.out.println("Punto añadido: " + p);
        return true;
    }

    public void mostrarGrafico() {

        if (puntos.isEmpty()) {
            System.out.println("No hay puntos.");
            return;
        }

        int maxX = 0;
        int maxY = 0;

        for (Punto p : puntos) {
            if (p.getX() > maxX) maxX = p.getX();
            if (p.getY() > maxY) maxY = p.getY();
        }

        for (int y = maxY; y >= 0; y--) {
            for (int x = 0; x <= maxX; x++) {

                boolean encontrado = false;

                for (Punto p : puntos) {
                    if (p.getX() == x && p.getY() == y) {
                        System.out.print("X ");
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.print("· ");
                }
            }
            System.out.println();
        }
    }

    // 🔥 MAIN DE PRUEBA
    public static void main(String[] args) {

        GraficoLineas2D grafico = new GraficoLineas2D();

        grafico.addPunto(new Punto("P1", 1, 1));
        grafico.addPunto(new Punto("P2", 2, 2));
        grafico.addPunto(new Punto("P3", 3, 3));
        grafico.addPunto(new Punto("P4", 4, 4));
        grafico.addPunto(new Punto("P5", 5, 5));

        System.out.println("\nGráfico generado:\n");
        grafico.mostrarGrafico();
    }
}
