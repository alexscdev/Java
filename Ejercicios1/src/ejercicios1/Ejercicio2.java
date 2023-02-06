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
public class Ejercicio2 {
   
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introoduce un numero:");
        int num = input.nextInt();
        int mult = num * 20;
        int div = mult / 10;
        System.out.println(div);
        int sum = mult + num;
        int div2 = sum / 10;
        int remainder = sum % 10;
        System.out.println(div2);
        if (remainder != 0) {
            System.out.println(remainder);
        }
    }
}
