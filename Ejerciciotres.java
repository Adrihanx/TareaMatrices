/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosmatriz;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alanantonio
 */
public class Ejerciciotres {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el ancho de la matriz:"));
        int m = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el alto de la matriz:"));
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el npumero máximo de llenado:"));
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; i++) {
            System.out.println("dame el valor en ["+j+","+i+"]:");
                a[i][j]=scanner.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < a[0].length; j++) {                
                System.out.print(a[i][j]+" ");
            }
        }
        System.out.println("\n\n\nMatriz Inversa\n\n\n");
        for (int i = 0; i < a[0].length; i++) {
            System.out.print("\n");
            for (int j = 0; j < a.length; j++) {                
                System.out.print(a[j][i]+" ");
            }
        }
    }
}

