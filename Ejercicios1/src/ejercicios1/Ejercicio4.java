/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios1;
import java.util.Scanner;
/**
 *
 * @author Alejandro Sanchez
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tiempo en segundos: ");
        double t = scanner.nextDouble();
        double v = 3.2; 
        double s = 5.5;
                
        double d = s + (v * t);
        System.out.println("El espacio recorrido es: " + d + " metros.");
    }
}

