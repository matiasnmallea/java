package ejercicios;

import java.util.Scanner;

public class CelsiusAFahrenheit {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de grados Celsius:"); // pide al usuario la cantidad de grados celsius a convertir
        double gradosCelsius = scanner.nextDouble();

        double gradosFahrenheit = (gradosCelsius * 9/5) + 32; // realiza la conversión a grados Fahrenheit

        System.out.println(gradosCelsius + " grados Celsius son " + gradosFahrenheit + " grados Fahrenheit.");

        scanner.close();
    }
}




