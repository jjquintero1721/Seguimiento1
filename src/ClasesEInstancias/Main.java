package ClasesEInstancias;

public class Main {
    public static void main(String[] args) {
        Coche4 coche1 = new Coche4("Toyota", "Corolla", "Rojo");
        Coche4 coche2 = new Coche4("Honda", "Civic", "Azul");
        Coche4 coche3 = new Coche4("Ford", "Focus", "Negro");

        coche1.mostrarInformacion();
        coche2.mostrarInformacion();
        coche3.mostrarInformacion();
    }
}

