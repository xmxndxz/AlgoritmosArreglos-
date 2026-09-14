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
                    + "1. Longitud y último elemento\n"
                    + "1. Mostrar posición boleanos\n"
                    + "3. Leer 8 números y mostrarlos\n"
                    + "4. Palabra a arreglo de caracteres\n"
                    + "0. Volver al menú principal\n"
                    + "Seleccione una opción:"
            );
            opcion = Integer.parseInt(entrada);

            switch (opcion) {
                
                case 1:
                    Nivel1.metodo1();
                    break;
                
                case 2:
                     Nivel1.metodo2();
                break;
                    
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
                    + "5. promedio de 8 números decimales\n"
                    + "6. Asistencia y porcentajes\n"
                    + "7. Contar vocales en una palabra\n"
                    + "8. Suma en índices pares e impares\n"
                    + "0. Volver al menú principal\n"
                    + "Seleccione una opción:"
            );
            opcion = Integer.parseInt(entrada);

            switch (opcion) {
                
              
                    
                    
                case 5:
                    Nivel2.metodo5();
                    break; 
                
                case 6:
                    Nivel2.metodo6();
                    break;
                    
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

 private static void menuNivel3() {
    int opcion;

    do {
        String entrada = JOptionPane.showInputDialog(
                "NIVEL 3\n"
                + "9. Mayor y menor\n"
                + "10. Buscar primera posición\n"
                + "11. Contar apariciones de un valor\n"
                + "12. Contar vocales, consonantes y otros símbolos\n"
                + "0. Volver al menú principal\n"
                + "Seleccione una opción:"
        );

        opcion = Integer.parseInt(entrada);

        switch (opcion) {

            case 9:
                Nivel3.metodo9();
                break;

            case 10:
                Nivel3.metodo10();
                break;

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

 
 private static void menuNivel4() {
    int opcion;

    do {
        String entrada = JOptionPane.showInputDialog(
                "NIVEL 4\n"
                + "13. Invertir un arreglo\n"
                + "14. Copia independiente de un arreglo\n"
                + "0. Volver al menú principal\n"
                + "Seleccione una opción:"
        );

        opcion = Integer.parseInt(entrada);

        switch (opcion) {
            case 13:
                Nivel4.metodo13();
                break;
            case 14:
                Nivel4.metodo14();
                break;
            case 0:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
        }

    } while (opcion != 0);
}
 
 private static void menuNivel5() {
    int opcion;

    do {
        String entrada = JOptionPane.showInputDialog(
                "NIVEL 5\n"
                + "19. Arreglo ordenado de forma ascendente\n"
                + "20. Determinar si un arreglo es capicúa\n"
                + "0. Volver al menú principal\n"
                + "Seleccione una opción:"
        );

        opcion = Integer.parseInt(entrada);

        switch (opcion) {
            case 19:
                Nivel5.metodo19();
                break;
            case 20:
                Nivel5.metodo20();
                break;
            case 0:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
        }

    } while (opcion != 0);
}
}

