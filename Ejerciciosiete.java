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
public class Ejerciciosiete {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el ancho de la matriz :"));
        int m = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el alto de la matriz :"));
        int[][] a = new int[n][m];
        int z=0,x=n;
        for (int i = 0; i < a.length; i++) {
            z=0;
            x=n;
            for (int j = 0; j < a[0].length; j++) {  
                if (i%2!=0) {
                    a[i][j]=z;
                    z++;
                }
                else if (i%2==0) {
                    a[i][j]=x;
                    x--;
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
