

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;
import java.util.Arrays;
/**
 *
 * @author Tarde
 */
public class Matrices {



    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                matriz[i-1][j-1] = i * j;
            }
        }

        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }
}

