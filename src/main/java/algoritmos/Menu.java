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
                    menuNivel3();
                    break;
                case 4:
                    menuNivel4();
                    break;
                case 5:
                    menuNivel5();
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

    // Submenú Nivel 3
    private static void menuNivel3() {
        int opcion;
        do {
            String entrada = JOptionPane.showInputDialog(
                    "NIVEL 3\n"
                    + "11. Frecuencia de un valor en el arreglo\n"
                    + "12. Clasificar vocales, consonantes y otros\n"
                    + "0. Volver al menú principal\n"
                    + "Seleccione una opción:"
            );
            opcion = Integer.parseInt(entrada);

            switch (opcion) {
                case 11:
                    Nivel3.metodo11();
                    break;
                case 12:
                    Nivel3.metodo12();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 0);
    }
    // Submenú Nivel 4

    private static void menuNivel4() {
        int opcion;
        do {
            String entrada = JOptionPane.showInputDialog(
                    "NIVEL 4\n"
                    + "15. Rotar arreglo una posición a la derecha\n"
                    + "16. Intercambiar valores en dos índices válidos\n"
                    + "0. Volver al menú principal\n"
                    + "Seleccione una opción:"
            );
            opcion = Integer.parseInt(entrada);

            switch (opcion) {
                case 15:
                    Nivel4.metodo15();
                    break;
                case 16:
                    Nivel4.metodo16();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 0);
    }

    // Submenú Nivel 5
    private static void menuNivel5() {
        int opcion;
        do {
            String entrada = JOptionPane.showInputDialog(
                    "NIVEL 5\n"
                    + "17. Suma de dos arreglos en paralelo\n"
                    + "18. Diferencia absoluta de precios y promedio\n"
                    + "0. Volver al menú principal\n"
                    + "Seleccione una opción:"
            );
            opcion = Integer.parseInt(entrada);

            switch (opcion) {
                case 17:
                    Nivel5.metodo17();
                    break;
                case 18:
                    Nivel5.metodo18();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 0);
    }

}
