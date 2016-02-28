/*
 * To change this license header, choose License Headers in Project Properties.            for (int j = 0; j < a[0].length; j++) {
                if (a[i]==v[i][j]) {
                    
                }
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosmatriz;

import java.util.Random;
import javax.swing.JOptionPane;

public class EjercicioExtrados {
    public static void main(String[] args) {
        int dx = Integer.parseInt(JOptionPane.showInputDialog(null, "Dimension  de la matriz cuadrada:"));
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el valor maximo de llenado:"));
        Random random = new Random();
        int cont = 0,i,j;
        int[][] a = new int[dx][dx];
        int[] v = new int[dx];
        for (int k = 0; k < a.length; k++) {
            for (int l = 0; l < a[0].length; l++) {
                a[k][l]=random.nextInt(num);
            }
        }
        for (int k = 0; k < a.length; k++) {
            System.out.print("\n");
            for (int l = 0; l < a[k].length; l++) {
                System.out.print(a[k][l]+" ");
            }
        }
        for (int k = 0; k < v.length; k++) {
            v[k]=random.nextInt(num);
        }
        System.out.print("\n\n");
        for (int k = 0; k < v.length; k++) {
            System.out.print(v[k]+" ");
        }
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[0].length; j++) {
                if (v[j]==a[i][j]) {
                    cont++;
                }
            }
            if (cont==a.length) {
                System.out.println("\n es igual con la linea: "+(i+1));
                cont=0;
                }
            else if (cont!=a.length) {
                cont=0;
            }
        }
    }
}
