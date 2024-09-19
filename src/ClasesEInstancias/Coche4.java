package ClasesEInstancias;

class Coche4 {
    String marca;
    String modelo;
    String color;

    // Constructor que inicializa marca, modelo y color
    Coche4(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color);
    }
}
