package Tiposdedatos;

public class Practica2 {
    public static void main(String[] args) {
        // Convertir los tipos primitivos en objetos usando clases Wrapper
        Integer numero = Integer.valueOf(10);  // int a Integer
        Character letra = Character.valueOf('A');  // char a Character
        Boolean esVerdadero = Boolean.valueOf(true);  // boolean a Boolean

        // Mostrar los objetos
        System.out.println("Numero: " + numero);
        System.out.println("Letra: " + letra);
        System.out.println("Es verdadero: " + esVerdadero);
    }
}
