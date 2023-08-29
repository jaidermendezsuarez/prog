/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tercer.punto;

/**
 *
 * @author JAIDER EMILIO MENDEZ
 */

public class TercerPunto {
    public static void main(String[] args) {
        // Definir las notas de los alumnos en un array bidimensional
        double[][] notas = {
            {5, 2.4, 3, 4, 2},  // Notas del primer alumno
            {3, 3.1, 2, 4, 1},  // Notas del segundo alumno
            {4.3, 3, 4, 2.6,1},  // Notas del tercer alumno
            // Agrega más filas para representar las notas de otros alumnos
        };

        // Calcular la media de cada alumno
        double[] mediasAlumnos = new double[notas.length];
        for (int i = 0; i < notas.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            mediasAlumnos[i] = suma / notas[i].length;
        }

        // Calcular la media de cada asignatura
        double[] mediasAsignaturas = new double[notas[0].length];
        for (int j = 0; j < notas[0].length; j++) {
            double suma = 0;
            for (double[] nota : notas) {
                suma += nota[j];
            }
            mediasAsignaturas[j] = suma / notas.length;
        }

        // Calcular la media total de la clase
        double sumaTotal = 0;
        for (int i = 0; i < mediasAlumnos.length; i++) {
            sumaTotal += mediasAlumnos[i];
        }
        double mediaTotal = sumaTotal / mediasAlumnos.length;

        // Ordenar los alumnos por orden decreciente de notas medias individuales
        String[] nombresAlumnos = {"Alumno 1", "Alumno 2", "Alumno 3"};  // Agrega más nombres según la cantidad de alumnos
        for (int i = 0; i < mediasAlumnos.length - 1; i++) {
            for (int j = 0; j < mediasAlumnos.length - i - 1; j++) {
                if (mediasAlumnos[j] < mediasAlumnos[j + 1]) {
                    // Intercambiar notas medias
                    double tempMedia = mediasAlumnos[j];
                    mediasAlumnos[j] = mediasAlumnos[j + 1];
                    mediasAlumnos[j + 1] = tempMedia;

                    // Intercambiar nombres de alumnos
                    String tempNombre = nombresAlumnos[j];
                    nombresAlumnos[j] = nombresAlumnos[j + 1];
                    nombresAlumnos[j + 1] = tempNombre;
                }
            }
        }

        // Imprimir los resultados
        System.out.println("Media de cada alumno:");
        for (int i = 0; i < mediasAlumnos.length; i++) {
            System.out.println(nombresAlumnos[i] + ": " + mediasAlumnos[i]);
        }

        System.out.println("Media de cada asignatura:");
        for (int j = 0; j < mediasAsignaturas.length; j++) {
            System.out.println("Asignatura " + (j + 1) + ": " + mediasAsignaturas[j]);
        }

        System.out.println("Media total de la clase: " + mediaTotal);
    }
}