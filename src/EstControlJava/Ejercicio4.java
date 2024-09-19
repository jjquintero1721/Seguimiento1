package EstControlJava;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Introduce un número mayor a 10:");
            numero = scanner.nextInt();
        } while (numero <= 10);

        System.out.println("Número válido: " + numero);
    }
}
