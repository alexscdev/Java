package bucles;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tarde
 */
public class TablaMul {
    public static void main(String args[]){
        Scanner consola = new Scanner (System.in);
        System.out.println("Introduzca un numero: ");
        var numero = consola.nextInt();
        for (int i=1; i<=10; i++){
            var calculo = numero*i;
            System.out.println(numero + "X" + i + "= " + calculo);
        }
    }
}
