package Constructores;

class Matematica {
    // Multiplicar enteros
    int multiplicar(int a, int b) {
        return a * b;
    }

    // Multiplicar dobles
    double multiplicar(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Matematica math = new Matematica();

        // Usar el método sobrecargado
        System.out.println("Multiplicar enteros: " + math.multiplicar(4, 5));
        System.out.println("Multiplicar dobles: " + math.multiplicar(4.5, 5.5));
    }
}
