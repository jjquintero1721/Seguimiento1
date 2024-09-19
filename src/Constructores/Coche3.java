package Constructores;

class Coche3 {
    String marca;
    String modelo;

    // Constructor sin parámetros
    Coche3() {
        marca = "Toyota";
        modelo = "Corolla";
    }

    // Constructor con parámetros
    Coche3(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public static void main(String[] args) {
        Coche3 coche1 = new Coche3();  // Usando constructor sin parámetros
        Coche3 coche2 = new Coche3("Honda", "Civic");  // Usando constructor con parámetros

        System.out.println("Coche 1 - Marca: " + coche1.marca + ", Modelo: " + coche1.modelo);
        System.out.println("Coche 2 - Marca: " + coche2.marca + ", Modelo: " + coche2.modelo);
    }
}

