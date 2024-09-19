package ModificadorFinal;

public class TestConstante {
    public static void main(String[] args) {
        ConstanteMatematica constante = new ConstanteMatematica();
        double circunferencia = constante.calcularCircunferencia(5.0);
        System.out.println("Circunferencia: " + circunferencia);
    }
}