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
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        double num = input.nextDouble();
        double mult = num * 20.0;
        double div = mult / 10;
        System.out.println(div);
        double sum = mult + num;
        double div2 = sum / 10;
        double remainder = sum % 10;
        System.out.println(div2);
        if (remainder != 0.0) {
            System.out.println(remainder);
        }
    }
}