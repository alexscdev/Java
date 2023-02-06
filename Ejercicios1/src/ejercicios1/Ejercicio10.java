/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios1;

/**
 *
 * @author Alejandro Sanchez
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Character variable1 = 'x';
        Character variable2 = '$';
        
        int variable1Code = (int) variable1;
        int variable2Code = (int) variable2;
        System.out.println("El codigo numerico de " + variable1 + " es: " + variable1Code);
        System.out.println("El codigo numerico de " + variable2 + " es: " + variable2Code);

        boolean isVariable1Upper = Character.isUpperCase(variable1);
        boolean isVariable2Upper = Character.isUpperCase(variable2);
        System.out.println(variable1 + " es mayuscula: " + isVariable1Upper);
        System.out.println(variable2 + " es mayuscula: " + isVariable2Upper);

        boolean areEqual = variable1.equals(variable2);
        System.out.println(variable1 + " es igual a " + variable2 + ": " + areEqual);
        
        String variable1String = variable1.toString();
        String variable2String = variable2.toString();
        System.out.println("La conversion a String de " + variable1 + " es: " + variable1String);
        System.out.println("La conversion a String de " + variable2 + " es: " + variable2String);
    }
}
