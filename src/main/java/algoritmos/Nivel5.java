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
    
    public static void metodo19() {

    int[] numeros = new int[10];

    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese el número " + (i + 1)
                )
        );
    }

    boolean ordenado = true;

    for (int i = 0; i < numeros.length - 1; i++) {

        if (numeros[i] > numeros[i + 1]) {
            ordenado = false;
            break;
        }
    }

    if (ordenado == true) {
        JOptionPane.showMessageDialog(null,
                "El arreglo está ordenado de forma ascendente.");
    } else {
        JOptionPane.showMessageDialog(null,
                "El arreglo no está ordenado de forma ascendente.");
    }
}
    public static void metodo20() {

    int[] numeros = new int[10];

    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese el número " + (i + 1)
                )
        );
    }

    boolean capicua = true;

    for (int i = 0; i < numeros.length / 2; i++) {

        if (numeros[i] != numeros[numeros.length - 1 - i]) {
            capicua = false;
            break;
        }
    }

    if (capicua == true) {
        JOptionPane.showMessageDialog(null,
                "El arreglo es capicúa.");
    } else {
        JOptionPane.showMessageDialog(null,
                "El arreglo no es capicúa.");
    }
}
}
