/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosmatriz;

/**
 *
 * @author alanantonio
 */
public class EjercicioExtracuatro {
    public static void main(String[] args) {
        int x=5;
        char[][] a = new char[x][x];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]='*';
            }
        }
        for (int i = 0; i<a.length; i++) {
            System.out.print("\n");
            for (int j = 0; j <a.length-i; j++) {
                System.out.print(a[i][j]+" ");
            }
        }
    }
}
