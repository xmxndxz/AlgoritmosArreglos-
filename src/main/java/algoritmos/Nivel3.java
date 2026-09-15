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

    
    public static void metodo9() {

    int[] numeros = new int[10];

    // Leer los 10 números
    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese el número " + (i + 1)
                )
        );
    }

    // El mayor y el menor empiezan con el primer elemento
    int mayor = numeros[0];
    int menor = numeros[0];

    // Buscar el mayor y el menor
    for (int i = 1; i < numeros.length; i++) {

        if (numeros[i] > mayor) {
            mayor = numeros[i];
        }

        if (numeros[i] < menor) {
            menor = numeros[i];
        }
    }

    JOptionPane.showMessageDialog(null,
            "El número mayor es: " + mayor
            + "\nEl número menor es: " + menor);
}
        
        
    
    public static void metodo10() {

    int[] numeros = new int[10];

    // Leer los números del arreglo
    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese el número " + (i + 1)
                )
        );
    }

    // Pedir el número que se desea buscar
    int buscado = Integer.parseInt(
            JOptionPane.showInputDialog(
                    "Ingrese el número que desea buscar"
            )
    );

    int posicion = -1;

    // Buscar la primera posición
    for (int i = 0; i < numeros.length; i++) {

        if (numeros[i] == buscado) {
            posicion = i;
            break;
        }
    }

    JOptionPane.showMessageDialog(null,
            "Posición: " + posicion);
}
    
    
    
    
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
    
    }

