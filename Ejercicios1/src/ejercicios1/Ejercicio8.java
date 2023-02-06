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
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor de i: ");
        int i = input.nextInt();
        System.out.println("Ingrese el valor de j: ");
        int j = input.nextInt();
        System.out.println("Ingrese el valor de x: ");
        double x = input.nextDouble();
        System.out.println("Ingrese el valor de y: ");
        double y = input.nextDouble();

        int sumInt = i + j;
        int diffInt = i - j;
        int multInt = i * j;
        int divInt = i / j;
        int modInt = i % j;

        double sumReal = x + y;
        double diffReal = x - y;
        double multReal = x * y;
        double divReal = x / y;

        double mixedSum = i + y;
        double mixedDiff = j - x;
        double mixedMult = i * x;
        double mixedDiv = y / j;

        boolean iGreater = i > j;
        boolean jGreater = j > i;

        System.out.println("i + j = " + sumInt);
        System.out.println("i - j = " + diffInt);
        System.out.println("i * j = " + multInt);
        System.out.println("i / j = " + divInt);
        System.out.println("i % j = " + modInt);
        System.out.println("x + y = " + sumReal);
        System.out.println("x - y = " + diffReal);
        System.out.println("x * y = " + multReal);
        System.out.println("x / y = " + divReal);
        System.out.println("i + y = " + mixedSum);
        System.out.println("j - x = " + mixedDiff);
        System.out.println("i * x = " + mixedMult);
        System.out.println("y / j = " + mixedDiv);
        System.out.println("i > j: " + iGreater);
        System.out.println("j > i: " + jGreater);
    }
}
