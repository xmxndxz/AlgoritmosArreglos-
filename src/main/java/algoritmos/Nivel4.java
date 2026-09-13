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
    }
