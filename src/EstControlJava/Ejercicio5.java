package EstControlJava;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int numeroSecreto = 7;

        do {
            System.out.println("Adivina el número secreto:");
            numero = scanner.nextInt();
        } while (numero != numeroSecreto);

        System.out.println("¡Correcto! El número secreto es " + numeroSecreto);
    }
}
