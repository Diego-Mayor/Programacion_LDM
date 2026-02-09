package POO.CChe;

public class CocheMain {
    public static void main(String[] args) {

        System.out.println("==============================");

        // Crear objetos Coche
        Coche c1 = new Coche(
                "Kia Picanto",
                "Negro",
                "LJHC92",
                TipoCoche.UTILITARIO,
                2019,
                false,
                ModalidadSeguro.TERCEROS
        );

        Coche c2 = new Coche(
                "Toyota CH-VR",
                "Azul", 
                "LLMN123", 
                TipoCoche.FAMILIAR, 
                2024, 
                true, 
                ModalidadSeguro.TODO_RIESGO);

        Coche c3 = new  Coche(
                "Citroen C4", 
                "Blanco", 
                "WQRT098", 
                TipoCoche.MINI, 
                2024, 
                false,ModalidadSeguro.TERCEROS);

        // Imprimir información del coche
        System.out.println("==============================");
        c1.imprimir();
        System.out.println("==============================");
        c2.imprimir();
        System.out.println("==============================");
        c3.imprimir();
    }
}
