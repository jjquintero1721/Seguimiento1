package Constructores;

class Coche {
    String marca;
    String modelo;

    // Constructor sin parámetros
    Coche() {
        marca = "Toyota";
        modelo = "Corolla";
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        System.out.println("Marca: " + miCoche.marca);
        System.out.println("Modelo: " + miCoche.modelo);
    }
}

