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
public class Nivel4 {

    
    
    public static void metodo13() {

    int[] numeros = {1, 2, 3, 4, 5, 6};

    for (int i = 0; i < numeros.length / 2; i++) {

        int numeroGuardado = numeros[i];

        numeros[i] = numeros[numeros.length - 1 - i];

        numeros[numeros.length - 1 - i] = numeroGuardado;
    }

    String resultado = "";

    for (int i = 0; i < numeros.length; i++) {
        resultado = resultado + numeros[i] + " ";
    }

    JOptionPane.showMessageDialog(null,
            "Arreglo invertido: " + resultado);
}
    
    
    
    
    public static void metodo14() {

    int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] copia = new int[10];

    // Copiar cada elemento
    for (int i = 0; i < original.length; i++) {
        copia[i] = original[i];
    }

    // Modificar solamente la copia
    copia[0] = 100;

    String mostrarOriginal = "";
    String mostrarCopia = "";

    for (int i = 0; i < original.length; i++) {
        mostrarOriginal = mostrarOriginal + original[i] + " ";
        mostrarCopia = mostrarCopia + copia[i] + " ";
    }

    JOptionPane.showMessageDialog(null,
            "Arreglo original: " + mostrarOriginal
            + "\nArreglo copia: " + mostrarCopia);
}


    // Algoritmo 15
    public static void metodo15() {

        int tam = -1;
        boolean tamValido = false;
        while (!tamValido) {
            String entradaTam = JOptionPane.showInputDialog("Ingrese el tamaño del arreglo (mayor a 0):");
            tam = Integer.parseInt(entradaTam);
            if (tam > 0) {
                tamValido = true;
            } else {
                JOptionPane.showMessageDialog(null, "El tamaño debe ser mayor a 0. Intente nuevamente.");
            }
        }
        int[] numeros = new int[tam]; // arreglo original
        for (int i = 0; i < numeros.length; i++) {
            String entrada = JOptionPane.showInputDialog("Ingrese el número #" + (i + 1) + ":");
            numeros[i] = Integer.parseInt(entrada);
        }

        int[] rotado = new int[numeros.length]; // arreglo con el resultado de la rotación

        if (numeros.length > 0) {
            rotado[0] = numeros[numeros.length - 1];
            for (int i = 1; i < numeros.length; i++) {
                rotado[i] = numeros[i - 1];
            }
        }

        String resultado = "Arreglo original:\n";
        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i] + "\n";
        }
        resultado += "\nArreglo rotado a la derecha:\n";
        for (int i = 0; i < rotado.length; i++) {
            resultado += rotado[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }

    // Algoritmo 16
    public static void metodo16() {

        int tam = -1;
        boolean tamValido = false;
        while (!tamValido) {
            String entradaTam = JOptionPane.showInputDialog("Ingrese el tamaño del arreglo (mayor a 0):");
            tam = Integer.parseInt(entradaTam);
            if (tam > 0) {
                tamValido = true;
            } else {
                JOptionPane.showMessageDialog(null, "El tamaño debe ser mayor a 0. Intente nuevamente.");
            }
        }

        int[] numeros = new int[tam];
        for (int i = 0; i < numeros.length; i++) {
            String entrada = JOptionPane.showInputDialog("Ingrese el número #" + (i + 1) + ":");
            numeros[i] = Integer.parseInt(entrada);
        }

        // Solicitar y validar el primer índice
        int indice1 = -1;
        boolean valido1 = false;
        while (!valido1) {
            String e1 = JOptionPane.showInputDialog(
                    "Ingrese el primer índice a intercambiar (0 a " + (numeros.length - 1) + "):");
            indice1 = Integer.parseInt(e1);
            if (indice1 >= 0 && indice1 < numeros.length) {
                valido1 = true;
            } else {
                JOptionPane.showMessageDialog(null, "Índice fuera de rango. Intente nuevamente.");
            }
        }

        // Solicitar y validar el segundo índice
        int indice2 = -1;
        boolean valido2 = false;
        while (!valido2) {
            String e2 = JOptionPane.showInputDialog(
                    "Ingrese el segundo índice a intercambiar (0 a " + (numeros.length - 1) + "):");
            indice2 = Integer.parseInt(e2);
            if (indice2 >= 0 && indice2 < numeros.length) {
                valido2 = true;
            } else {
                JOptionPane.showMessageDialog(null, "Índice fuera de rango. Intente nuevamente.");
            }
        }

        // Intercambio de valores usando variable auxiliar
        int temporal = numeros[indice1];
        numeros[indice1] = numeros[indice2];
        numeros[indice2] = temporal;

        String resultado = "Arreglo luego del intercambio:\n";
        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }

}
