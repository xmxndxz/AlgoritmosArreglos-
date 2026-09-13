/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmos;

import javax.swing.JOptionPane;

//@author amand
public class Menu {

    public static void iniciar() {
        int opcion;
        do {
            String entrada = JOptionPane.showInputDialog("""
                                                         MEN\u00da PRINCIPAL
                                                         1. Nivel 1
                                                         2. Nivel 2
                                                         3. Nivel 3
                                                         4. Nivel 4
                                                         5. Nivel 5
                                                         0. Salir
                                                         Seleccione una opci\u00f3n:""");
            opcion = Integer.parseInt(entrada);

            switch (opcion) {
                case 1:
                    menuNivel1();
                    break;
                case 2:
                    menuNivel2();
                    break;
                case 3:
                    //menuNivel3();
                    break;
                case 4:
                    // menuNivel4();
                    break;
                case 5:
                    //menuNivel5();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 0);
    }

    // Submenú Nivel 1
    private static void menuNivel1() {
        int opcion;
        do {
            String entrada = JOptionPane.showInputDialog(
                    "NIVEL 1\n"
                    + "3. Leer 8 números y mostrarlos\n"
                    + "4. Palabra a arreglo de caracteres\n"
                    + "0. Volver al menú principal\n"
                    + "Seleccione una opción:"
            );
            opcion = Integer.parseInt(entrada);

            switch (opcion) {
                case 3:
                    Nivel1.metodo3();
                    break;
                case 4:
                    Nivel1.metodo4();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 0);
    }

    // Submenú Nivel 2
    private static void menuNivel2() {
        int opcion;
        do {
            String entrada = JOptionPane.showInputDialog(
                    "NIVEL 2\n"
                    + "7. Contar vocales en una palabra\n"
                    + "8. Suma en índices pares e impares\n"
                    + "0. Volver al menú principal\n"
                    + "Seleccione una opción:"
            );
            opcion = Integer.parseInt(entrada);

            switch (opcion) {
                case 7:
                    Nivel2.metodo7();
                    break;
                case 8:
                    Nivel2.metodo8();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 0);
    } 

}
