/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import javax.swing.JOptionPane;

/**
 *
 * @author amand //AmandaAR
 */
public class Nivel1 {

//método algoritmo 1
public static void metodo1(){

    double[] numeros ={2.3, 8.8, 9.3, 6.1};
    JOptionPane.showMessageDialog(null, numeros.length + "longitud del arreglo");
    JOptionPane.showMessageDialog(null, "Último elemento: "  + numeros[numeros.length-1]);
}
        
//método algoritmo 2
public static void metodo2(){
boolean[] valores = new boolean[6];
for (int i = 0; i < valores.length; i++) {
    JOptionPane.showMessageDialog(null,
        "Posición " + i + ": " + valores[i]);
}
}

    
    //Algoritmo 3
    public static void metodo3() {
        int[] numeros = new int[8]; 

        for (int i = 0; i < numeros.length; i++) {
            String entrada = JOptionPane.showInputDialog("Ingrese un número entero, #" + (i + 1) + " de 8:");
            numeros[i] = Integer.parseInt(entrada);
        }

        // Recorrido para mostrar los valores, uno por línea
        String resultado = "Valores ingresados:\n";
        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }

    //Algortimo 4
    public static void metodo4() {
        String palabra = JOptionPane.showInputDialog("Ingrese una palabra conocida:");
        char[] letras = palabra.toCharArray(); // arreglo unidimensional de tipo primitivo char

        String resultado = "Caracteres de la palabra:\n";
        for (int i = 0; i < letras.length; i++) {
            resultado += letras[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}

