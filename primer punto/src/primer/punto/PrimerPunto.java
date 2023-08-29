/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primer.punto;


import java.util.Arrays;

public class PrimerPunto {
    public static void main(String[] args) {
        int[] lista = {4, 2, 7, 1, 5};
        PrimerPunto(lista);
        System.out.println(Arrays.toString(lista));
    }

    public static void PrimerPunto(int[] lista) {
        int n = lista.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (lista[j] < lista[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = lista[min_idx];
            lista[min_idx] = lista[i];
            lista[i] = temp;
        }
    }
}