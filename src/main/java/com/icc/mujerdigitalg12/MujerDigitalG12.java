/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.icc.mujerdigitalg12;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author martinmelogodinez
 */
public class MujerDigitalG12 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        
        /*
            // Ejercicio Suma 2 números

            System.out.println("Dame el primer número");
            int num1 = scanner.nextInt();

            System.out.println("Dame el segundo número");
            int num2 = scanner.nextInt();

            int suma = num1 + num2;||

            System.out.println("El resultado de la suma de " + num1 + " y " + num2 + " es: " + suma);
        */
        
        // EJERCICIO:
        // 1. Recibir del teclado calificaciones separadas por comas (4,5,3,10,9,8,7)
        // 2. Calcular el promedio
        // 3. Calcular la mediana
        // 4. Encontrar la calificación más baja
        // 5. Encontrar la calificación más alta
        
        // - Recibir las calificaciones
        System.out.println("Dame las calificaciones separadas por comas");
        String calificacionesStr = scanner.nextLine();
        System.out.println("Calificaciones: "+ calificacionesStr);
        
        // - Convetir String a un Array (split)
        String[] calificacionesArray = calificacionesStr.split(",");
        System.out.println("arreglo de calificaciones: " + Arrays.toString(calificacionesArray));
        
        // - Convertir Array de Strings a un Arreglo de Ints
        int[] calificaciones = Arrays.stream(calificacionesArray).mapToInt(Integer::parseInt).toArray();
        
        // - Calcular el promedio
        int noCalificaciones = calificaciones.length;
        double totalCalificaciones = 0;
        
        for(int i = 0; i < noCalificaciones; i++) {
           int calificacionActual = calificaciones[i];
           totalCalificaciones += calificacionActual;
        }
        
        // NOTA: Si quieres obtener un resultado decimal, el dividendo
        // (totalCalificaciones) debe ser de tipo double.
        double promedio = totalCalificaciones / noCalificaciones;
        System.out.println("El promedio de las calificaciones es: " + promedio);
        
        // - Calcular la mediana
        // 3.1 Orderar el arreglo.
        Arrays.sort(calificaciones);
        System.out.println("Arreglo ordenado: " + Arrays.toString(calificaciones));
        
        // Obtener mediana
        if (noCalificaciones % 2 == 0) {
            double num1 = calificaciones[(noCalificaciones / 2) - 1];
        double num2 = calificaciones[(noCalificaciones / 2)];
            double mediana = (num1 + num2) / 2;
            System.out.println("La mediana es: " + mediana);
        } else {
            double mediana = calificaciones[((noCalificaciones + 1) / 2) - 1];
            System.out.println("La mediana es: " + mediana);
        }
        
        // Encontrar la calificación más baja
        System.out.println("La calificación más baja es: " + calificaciones[0]);
        
        // Encontrar la calificación más alta
        System.out.println("La calificación más alta es: " + calificaciones[noCalificaciones - 1]);
        
        
    }
}
