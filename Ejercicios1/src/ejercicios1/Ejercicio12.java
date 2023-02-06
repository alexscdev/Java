/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios1;

/**
 *
 * @author Alejandro Sanchez
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        String str1 = "Hola";
        String str2 = "lector";

        if (str1.equals(str2)) {
            System.out.println("Las dos cadenas son iguales.");
        } else {
            System.out.println("Las dos cadenas son diferentes.");
        }

        System.out.println("La longitud de " + str1 + " es: " + str1.length());
        System.out.println("La longitud de " + str2 + " es: " + str2.length());

        System.out.println("El segundo caracter de " + str1 + " es: " + str1.charAt(1));
        System.out.println("El segundo caracter de " + str2 + " es: " + str2.charAt(1));

        String str3 = str1.concat(str2);
        System.out.println("La cadena concatenada es: " + str3);
        System.out.println("Substring de la cadena concatenada desde el indice 2 hasta el 6: " + str3.substring(2, 6));
    }
}

