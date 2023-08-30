/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quinto.punto;

/**
 *
 * @author JAIDER EMILIO MENDEZ
 */
import java.util.Arrays;

public class quintopunto {
    public static void main(String[] args) {
        // Crear y rellenar lista A con 2000 enteros aleatorios en el rango 0...1999
        int[] listaA = new int[2000];
        for (int i = 0; i < listaA.length; i++) {
            listaA[i] = (int) (Math.random() * 2000);
        }
        Arrays.sort(listaA); // Ordenar lista A

        // Crear y rellenar lista B con 500 enteros aleatorios en el mismo rango
        int[] listaB = new int[500];
        for (int i = 0; i < listaB.length; i++) {
            listaB[i] = (int) (Math.random() * 2000);
        }

        // Realizar búsqueda secuencial y medir el tiempo
        long startTime = System.nanoTime();
        for (int i = 0; i < listaB.length; i++) {
            busquedaSecuencial(listaA, listaB[i]);
        }
        long endTime = System.nanoTime();
        long tiempoSecuencial = endTime - startTime;

        // Realizar búsqueda binaria y medir el tiempo
        startTime = System.nanoTime();
        for (int i = 0; i < listaB.length; i++) {
            busquedaBinaria(listaA, listaB[i]);
        }
        endTime = System.nanoTime();
        long tiempoBinaria = endTime - startTime;

        // Imprimir resultados
        System.out.println("Tiempo de calculo de busqueda secuencial: " + tiempoSecuencial + " nanosegundos");
        System.out.println("Tiempo de calculo de busqueda binaria: " + tiempoBinaria + " nanosegundos");
    }

    // Implementación de búsqueda secuencial
    public static boolean busquedaSecuencial(int[] lista, int clave) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == clave) {
                return true;
            }
        }
        return false;
    }

    // Implementación de búsqueda binaria
    public static boolean busquedaBinaria(int[] lista, int clave) {
        int inicio = 0;
        int fin = lista.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (lista[medio] == clave) {
                return true;
            } else if (lista[medio] < clave) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return false;
    }
}
