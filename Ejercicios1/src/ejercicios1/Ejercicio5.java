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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el coeficiente a: ");
        double a = input.nextDouble();
        System.out.println("Ingrese el coeficiente b: ");
        double b = input.nextDouble();
        System.out.println("Ingrese el coeficiente c: ");
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;
        
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Las raíces son: " + root1 + " y " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("La raíz única es: " + root);
        } else {
            System.out.println("La ecuacion no tiene solución real.");
        }
    }
}


