package Tiposdedatos;

public class Practica3 {
    public static void main(String[] args) {
        // Autoboxing: Se convierte el tipo primitivo a la clase Wrapper automáticamente
        Integer numero = 5;  // Autoboxing de int a Integer

        // Unboxing: Se convierte el objeto Wrapper a tipo primitivo automáticamente
        int numeroPrimitivo = numero;  // Unboxing de Integer a int

        // Mostrar los resultados
        System.out.println("Número (autoboxing): " + numero);
        System.out.println("Número primitivo (unboxing): " + numeroPrimitivo);
    }
}
