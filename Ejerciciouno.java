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
public class Ejerciciouno {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ancho de la matriz;"));
        int m = Integer.parseInt(JOptionPane.showInputDialog(null, "Alto de la matriz:"));
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Hasta que número quieres que se llene aleatoriamente:"));
        int[][] a = new int[n][m];
        Random random = new Random();
        int suma=0;
        int mayor=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
              a[i][j]=random.nextInt(num);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i%2!=0) {
                 suma+=a[i][j];
                    if (mayor<a[i][j]) {
                        mayor=a[i][j];
                    }
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
        }
        System.out.print("\n\nEnlas filas pares:\n");
        System.out.println("La suma es: "+suma+", y el mayor es: "+mayor);
    }
}
