package Constructores;

class Coche2 {
    String marca;
    String modelo;

    // Constructor con parámetros
    Coche2(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public static void main(String[] args) {
        Coche2 miCoche = new Coche2("Honda", "Civic");
        System.out.println("Marca: " + miCoche.marca);
        System.out.println("Modelo: " + miCoche.modelo);
    }
}
