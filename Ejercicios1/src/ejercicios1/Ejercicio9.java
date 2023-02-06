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
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor de i: ");
        int i = input.nextInt();
        System.out.println("Ingrese el valor de j: ");
        int j = input.nextInt();
        final int mascara = 9;

        boolean iGreater = i > j;
        boolean jGreater = j > i;
        boolean eitherGreater = i > j || j > i;
        System.out.println("i > j: " + iGreater);
        System.out.println("j > i: " + jGreater);
        System.out.println("i > j or j > i: " + eitherGreater);

        i = 129;
        int andResult = i & mascara;
        int orResult = i | mascara;
        System.out.println("i mascara &: " + andResult);
        System.out.println("i mascara |: " + orResult);

        i = 1;
        int shiftLeft = i << 4;
        int shiftRight = shiftLeft >> 2;
        System.out.println("i << 4: " + shiftLeft);
        System.out.println("(i << 4) >> 2: " + shiftRight);
    }
}
