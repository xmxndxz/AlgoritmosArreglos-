/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import javax.swing.JOptionPane;

/**
 *
 * @author amand
 */
public class Nivel5 {
    // Algoritmo 17
    public static void metodo17() {
        int tam = -1;
        boolean tamValido = false;
        while (!tamValido) {
            String entradaTam = JOptionPane.showInputDialog("Ingrese el tamaño de los arreglos (mayor a 0):");
            tam = Integer.parseInt(entradaTam);
            if (tam > 0) {
                tamValido = true;
            } else {
                JOptionPane.showMessageDialog(null, "El tamaño debe ser mayor a 0. Intente nuevamente.");
            }
        }
 
        int[] arregloA = new int[tam];
        int[] arregloB = new int[tam];
        int[] arregloSuma = new int[tam]; // tercer arreglo con las sumas
 
        for (int i = 0; i < arregloA.length; i++) {
            String entrada = JOptionPane.showInputDialog("Arreglo A - Ingrese el valor #" + (i + 1) + ":");
            arregloA[i] = Integer.parseInt(entrada);
        }
 
        for (int i = 0; i < arregloB.length; i++) {
            String entrada = JOptionPane.showInputDialog("Arreglo B - Ingrese el valor #" + (i + 1) + ":");
            arregloB[i] = Integer.parseInt(entrada);
        }
 
        // Procesamiento paralelo: se recorren ambos arreglos con el mismo índice
        for (int i = 0; i < arregloSuma.length; i++) {
            arregloSuma[i] = arregloA[i] + arregloB[i];
        }
 
        String resultado = "Arreglo resultado (A + B):\n";
        for (int i = 0; i < arregloSuma.length; i++) {
            resultado += arregloSuma[i] + "\n";
        }
 
        JOptionPane.showMessageDialog(null, resultado);
    }
 
    // Algoritmo 18
    public static void metodo18() {
        int tam = -1;
        boolean tamValido = false;
        while (!tamValido) {
            String entradaTam = JOptionPane.showInputDialog("Ingrese la cantidad de precios a comparar (mayor a 0):");
            tam = Integer.parseInt(entradaTam);
            if (tam > 0) {
                tamValido = true;
            } else {
                JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a 0. Intente nuevamente.");
            }
        }
 
        double[] preciosA = new double[tam];
        double[] preciosB = new double[tam];
        double[] diferencias = new double[tam]; // tercer arreglo con las diferencias absolutas
 
        for (int i = 0; i < preciosA.length; i++) {
            String entrada = JOptionPane.showInputDialog("Precios A - Ingrese el precio #" + (i + 1) + ":");
            preciosA[i] = Double.parseDouble(entrada);
        }
 
        for (int i = 0; i < preciosB.length; i++) {
            String entrada = JOptionPane.showInputDialog("Precios B - Ingrese el precio #" + (i + 1) + ":");
            preciosB[i] = Double.parseDouble(entrada);
        }
 
        double sumaDiferencias = 0; // acumulador para calcular el promedio
        for (int i = 0; i < diferencias.length; i++) {
            diferencias[i] = Math.abs(preciosA[i] - preciosB[i]);
            sumaDiferencias += diferencias[i];
        }
 
        double promedio = 0;
        if (diferencias.length > 0) {
            promedio = sumaDiferencias / diferencias.length; // promedio de las diferencias
        }
 
        String resultado = "Diferencias absolutas:\n";
        for (int i = 0; i < diferencias.length; i++) {
            resultado += diferencias[i] + "\n";
        }
        resultado += "\nPromedio de las diferencias: " + promedio;
 
        JOptionPane.showMessageDialog(null, resultado);
    }
}
