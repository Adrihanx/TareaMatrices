/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosmatriz;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author alanantonio
 */
public class Ejerciciodos {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el ancho de la matriz cuadrada:"));
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el npumero máximo de llenado:"));
        Random random = new Random();
        int[][] a = new int[n][n];
        int par=0,impar=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]=random.nextInt(num);
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
                if (a[i][j]%2==0) {
                    par+=a[i][j];
                }
                else if (a[i][j]%2!=0) {
                    impar+=a[i][j];
                }
            }
        }
        System.out.println("\nLa suma de los pares es: "+par);
        System.out.println("La suma de los impares es: "+impar);
    }
}
