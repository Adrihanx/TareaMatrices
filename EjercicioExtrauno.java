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
public class EjercicioExtrauno {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame hasta que número llenar:"));
        JOptionPane.showMessageDialog(null,"La primera matriz SIEMPRE tiene que ser la mas grande.");
        int ax = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el valor del ancho de la primera matriz:"));
        int ay = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el valor del lagro de la primera matriz:"));
        int bx = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el valor del ancho de la segundo matriz:"));
        int by = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el valor del largo de la segundo matriz:"));
        int m=ax*ay*bx*by;
        int[][] a = new int[ax][ay];
        int[][] b = new int[bx][by];
        int[] c = new int[m];
        Random random = new Random();
        int valor,cont=0;
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
        System.out.println("\n\n");
                for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j]=random.nextInt(num);
            }       
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j]+" ");
            }
        }
        System.out.print("\n\n");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    for (int l = 0; l < b[0].length; l++) {
                        if (a[i][j]==b[k][l]) {
                            c[m]=a[i][j];
                            cont++;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (repetir(c[i],c,i)) {
                System.out.println(c[i]);
            }
        }
    }
    public static boolean repetir(int j,int[]arr,int pos){
        for (int i = pos+1; i < arr.length; i++) {
            if (j==arr[i]) {
                return false;
            }
        }
        for (int i = pos-1; i >=0; i++) {
            if (j==arr[i]) {
                return false;
            }
        }
        return true;
    }
}