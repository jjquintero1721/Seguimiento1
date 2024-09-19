package Tiposdedatos;

public class Practica1 {
    public static void main(String[] args) {
        // String para almacenar el nombre
        String nombre = "Juan";

        // Array de enteros para almacenar edades favoritas
        int[] edadesFavoritas = {25, 30, 35};

        // Mostrar resultados
        System.out.println("Mi nombre es: " + nombre);
        System.out.print("Mis edades favoritas son: ");
        for (int edad : edadesFavoritas) {
            System.out.print(edad + " ");
        }
    }
}
