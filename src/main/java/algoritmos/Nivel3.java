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
        String texto = JOptionPane.showInputDialog("Ingrese una palabra o frase:");
        char[] letras = texto.toCharArray(); 

        int vocales = 0;     // contador de vocales
        int consonantes = 0; // contador de consonantes
        int otros = 0;       // contador de otros símbolos.(como espacios , etc)

        for (int i = 0; i < letras.length; i++) {
            char c = Character.toLowerCase(letras[i]);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            } else if (c >= 'a' && c <= 'z') {
                consonantes++;
            } else {
                otros++;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Vocales: " + vocales
                + "\nConsonantes: " + consonantes
                + "\nOtros símbolos: " + otros);
    }

