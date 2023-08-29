/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package segundo.punto;

/**
 *
 * @author JAIDER EMILIO MENDEZ
 */
  

import java.util.Arrays;

public class SegundoPunto {
    public static void main(String[] args) {
        double[] vector = {3, 5, 7, 1, 9};
        double mediana = calcularMediana(vector);
        System.out.println("La mediana del vector es: " + mediana);
    }

    public static double calcularMediana(double[] vector) {
        Arrays.sort(vector);
        int n = vector.length;
        if (n % 2 == 0) {
            int medio1 = n / 2 - 1;
            int medio2 = n / 2;
            return (vector[medio1] + vector[medio2]) / 2;
        } else {
            int medio = n / 2;
            return vector[medio];
        }
    }
}