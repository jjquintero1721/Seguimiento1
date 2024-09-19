package ModificadoresdeAcceso;

public class TestCoche {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.marca = "Toyota";
        coche.mostrarMarca();  // Acceso permitido
    }
}