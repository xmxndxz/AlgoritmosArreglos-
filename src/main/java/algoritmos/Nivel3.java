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
  

    public class Nivel3 {

        public static void metodo11() {
            int[] numeros = new int[12];

            for (int i = 0; i < numeros.length; i++) {
                String entrada = JOptionPane.showInputDialog("Ingrese el número #" + (i + 1) + " de 12:");
                numeros[i] = Integer.parseInt(entrada);
            }

            String entradaBuscado = JOptionPane.showInputDialog("Ingrese el valor que desea buscar en el arreglo:");
            int buscado = Integer.parseInt(entradaBuscado);

            int contador = 0; // contador de apariciones
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == buscado) {
                    contador++;
                }
            }

            JOptionPane.showMessageDialog(null,
                    "El valor " + buscado + " aparece " + contador + " vez(es) en el arreglo.");
        }
    }

    public static void metodo12() {
    }
