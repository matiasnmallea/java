package ejercicios;
import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {

    public static void main(String[] args) {

        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(100) + 1; // genera un n�mero entre 1 y 100

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivina el n�mero entre 1 y 100:");
        
        int numeroUsuario = scanner.nextInt(); // pide numero al usuario

        while (numeroUsuario != numeroAleatorio) {  // ciclo while hasta que el usuario adivine el n�mero
            if (numeroUsuario < numeroAleatorio) {
                System.out.println("El n�mero es m�s grande. Intenta de nuevo:");
            } else {
                System.out.println("El n�mero es m�s peque�o. Intenta de nuevo:");
            }
            numeroUsuario = scanner.nextInt();
        }

        System.out.println("Adivinaste el n�mero."); // victoria

        scanner.close();
    }
}