package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elije piedra, papel o tijera:"); // le pide al usuario que ingrese piedra papel o tijera
        String eleccionUsuario = scanner.nextLine();

   
        Random random = new Random();
        int eleccionComputadora = random.nextInt(3); // genera una elección aleatoria para la computadora
        String eleccionComputadoraString;
        if (eleccionComputadora == 0) {
            eleccionComputadoraString = "piedra";
        } else if (eleccionComputadora == 1) {
            eleccionComputadoraString = "papel";
        } else {
            eleccionComputadoraString = "tijera";
        }

      
        if (eleccionUsuario.equalsIgnoreCase("piedra")) { // compara y determina un ganador (o empate)
            if (eleccionComputadoraString.equals("piedra")) {
                System.out.println("Empate! La computadora eligió piedra.");
            } else if (eleccionComputadoraString.equals("papel")) {
                System.out.println("Perdiste! La computadora eligió papel.");
            } else {
                System.out.println("Ganaste! La computadora eligió tijera.");
            }
        } else if (eleccionUsuario.equalsIgnoreCase("papel")) {
            if (eleccionComputadoraString.equals("piedra")) {
                System.out.println("Ganaste! La computadora eligió piedra.");
            } else if (eleccionComputadoraString.equals("papel")) {
                System.out.println("Empate! La computadora eligió papel.");
            } else {
                System.out.println("Perdiste! La computadora eligió tijera.");
            }
        } else if (eleccionUsuario.equalsIgnoreCase("tijera")) {
        	  if (eleccionComputadoraString.equals("papel")) {
                  System.out.println("Ganaste! La computadora eligió papel.");
              } else if (eleccionComputadoraString.equals("tijera")) {
                  System.out.println("Empate! La computadora eligió tijera.");
              } else {
                  System.out.println("Perdiste! La computadora eligió piedra.");
              }
        }
        
        scanner.close();
    }
    
}