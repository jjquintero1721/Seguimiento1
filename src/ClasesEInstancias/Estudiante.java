package ClasesEInstancias;

class Estudiante {
    String nombre;
    int edad;
    String grado;

    // Constructor
    Estudiante(String nombre, int edad, String grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    // Método para mostrar la información del estudiante
    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Grado: " + grado);
    }
}



