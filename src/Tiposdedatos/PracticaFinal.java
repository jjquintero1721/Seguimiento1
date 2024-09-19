package Tiposdedatos;

public class PracticaFinal {
        public static void main(String[] args) {
            // Declarar una variable primitiva de cada tipo de dato
            int numeroInt = 10;
            double numeroDouble = 3.1416;
            char caracter = 'C';
            boolean esVerdadero = true;

            // Convertir las variables primitivas a sus respectivas Clases Wrapper
            Integer numeroIntWrapper = Integer.valueOf(numeroInt);
            Double numeroDoubleWrapper = Double.valueOf(numeroDouble);
            Character caracterWrapper = Character.valueOf(caracter);
            Boolean esVerdaderoWrapper = Boolean.valueOf(esVerdadero);

            // Realizar operaciones con ellas usando métodos de la clase Wrapper
            System.out.println("Operaciones con clases Wrapper:");
            System.out.println("Número Integer + 5: " + (numeroIntWrapper + 5));
            System.out.println("Número Double * 2: " + (numeroDoubleWrapper * 2));
            System.out.println("Letra es mayúscula: " + Character.isUpperCase(caracterWrapper));
            System.out.println("Valor booleano invertido: " + !esVerdaderoWrapper);
        }
    }

