/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import javax.swing.JOptionPane;

  //@author amand AmandaAR
 
public class Nivel2 {
    // Algoritmo 7
    public static void metodo7() {
        String palabra = JOptionPane.showInputDialog("Ingrese una palabra o frase:");
        char[] letras = palabra.toCharArray(); 
        int contadorVocales = 0; // contador auxiliar
 
        for (int i = 0; i < letras.length; i++) {
            char c = Character.toLowerCase(letras[i]);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }
 
        JOptionPane.showMessageDialog(null, "Cantidad de vocales encontradas: " + contadorVocales);
    }
 
    // Algoritmo 8
    public static void metodo8() {
        int[] numeros = new int[15]; 
 
        for (int i = 0; i < numeros.length; i++) {
            String entrada = JOptionPane.showInputDialog("Ingrese el número #" + (i + 1) + " de 15:");
            numeros[i] = Integer.parseInt(entrada);
        }
 
        int sumaPares = 0;   // acumulador para índices pares
        int sumaImpares = 0; // acumulador para índices impares
 
        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                sumaPares += numeros[i]; // el índice i es par
            } else {
                sumaImpares += numeros[i]; // el índice i es impar
            }
        }
 
        JOptionPane.showMessageDialog(null,
            "Suma de valores en índices pares: " + sumaPares +
            "\nSuma de valores en índices impares: " + sumaImpares);
    }
}
