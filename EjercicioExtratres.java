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
public class EjercicioExtratres {
    public static void main(String[] args) {
        int ax = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el ancho de la primera matriz:"));
        int ay = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el largo de la primer9a matriz:"));
        int bx = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el ancho de la segunda matriz:"));
        int by = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el largo de la segunda matriz:"));
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta hasta cuanto llenar:"));
        int j=ax,k=by;
        Random random = new Random();
        int[][] a = new int[ax][ay];
        int[][] b = new int[bx][by];
        int[][] c = new int[ax][by];
        if (dim(j,k)) {
            for (int i = 0; i < a.length; i++) {
                for (int l = 0; l < a[0].length; l++) {
                    a[i][l]=random.nextInt(num);
                }
            }
            for (int i = 0; i < a.length; i++) {
                for (int l = 0; l < a[0].length; l++) {
                    b[i][l]=random.nextInt(num);
                }
            }
            for (int i = 0; i < c.length; i++) {
                for (int l = 0; l < c[i].length; l++) {
                    for (int m = 0; m < ay; m++) {
                        c[i][l]+=a[i][m]*b[m][l];
                    }
                }
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print("\n");
                for (int l = 0; l < a[0].length; l++) {
                    System.out.print(a[i][l]+" ");
                }
            }
            System.out.println("\n\n");
            for (int i = 0; i < b.length; i++) {
                System.out.print("\n");
                for (int l = 0; l < b[0].length; l++) {
                    System.out.print(b[i][l]+" ");
                }
            }
            System.out.println("\n\n");
            for (int i = 0; i < c.length; i++) {
                System.out.print("\n");
                for (int l = 0; l < c[0].length; l++) {
                    System.out.print(c[i][l]+" ");
                }
            }
        }
        else{
            throw new RuntimeException("No se pueden multiplicar las matrices");
        }
    }
    public static boolean dim(int m, int n) {
        int largo=m;
        int ancho=n;
        return largo==ancho;
    }
}
