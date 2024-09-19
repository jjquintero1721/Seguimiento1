package ClasesEInstancias;

public class Main2 {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Ana", 20, "Segundo Año");
        Estudiante estudiante2 = new Estudiante("Luis", 22, "Tercer Año");
        Estudiante estudiante3 = new Estudiante("Maria", 21, "Primer Año");

        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        estudiante3.mostrarInformacion();
    }
}
