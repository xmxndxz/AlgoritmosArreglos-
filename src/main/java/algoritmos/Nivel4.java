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
}
