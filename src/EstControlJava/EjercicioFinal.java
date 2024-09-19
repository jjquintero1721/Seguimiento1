package EstControlJava;

import java.util.Scanner;

public class EjercicioFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicitar la edad y verificar si es mayor de edad
        System.out.println("Introduce tu edad:");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        // 2. Preguntar el día de la semana (1-7) y mostrar el nombre del día
        System.out.println("Introduce un número del 1 al 7 para saber el día de la semana:");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número no válido.");
        }

        // 3. Imprimir los números pares del 1 al 10 usando un bucle for
        System.out.println("Números pares del 1 al 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // 4. Solicitar un número hasta que el usuario introduzca uno mayor a 20 usando while
        int numero;
        do {
            System.out.println("Introduce un número mayor a 20:");
            numero = scanner.nextInt();
        } while (numero <= 20);
        System.out.println("Número válido: " + numero);

        // 5. Adivinar el número secreto con un bucle do-while (número secreto es 7)
        int numeroSecreto = 7;
        int intento;
        do {
            System.out.println("Adivina el número secreto (entre 1 y 10):");
            intento = scanner.nextInt();
        } while (intento != numeroSecreto);

        System.out.println("¡Correcto! El número secreto era " + numeroSecreto);
    }
}

