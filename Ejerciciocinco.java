/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosmatriz;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alanantonio
 */
public class Ejerciciocinco {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el ancho de la matriz:"));
        int m = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el ancho de la matriz:"));
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el valor para llenar:"));
        Random random = new Random();
        int[][] a = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {                               
             a[i][j]=random.nextInt(num);
            }
        }
                for (int i = 0; i < a.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < a[0].length; j++) {                
                System.out.print(a[i][j]+" ");
            }
        }
        System.out.println("\n\n\n");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {                
                if (i==0 || i==n-1 || j==0 || j==m-1) {
                    a[i][j]=0;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < a[0].length; j++) {                
                System.out.print(a[i][j]+" ");
            }
        }
    }
}
