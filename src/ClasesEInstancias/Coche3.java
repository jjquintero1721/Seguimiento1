package ClasesEInstancias;

class Coche3 {
String marca;
String modelo;
String color;

void mostrarInformacion() {
    System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color);
}

void cambiarColor(String nuevoColor) {
    color = nuevoColor;
}

String obtenerColor() {
    return color;
}
}
