package ejercicios;
import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {

    public static void main(String[] args) {

        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(100) + 1; // genera un número entre 1 y 100

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivina el número entre 1 y 100:");
        
        int numeroUsuario = scanner.nextInt(); // pide numero al usuario

        while (numeroUsuario != numeroAleatorio) {  // ciclo while hasta que el usuario adivine el número
            if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número es más grande. Intenta de nuevo:");
            } else {
                System.out.println("El número es más pequeño. Intenta de nuevo:");
            }
            numeroUsuario = scanner.nextInt();
        }

        System.out.println("Adivinaste el número."); // victoria

        scanner.close();
    }
}