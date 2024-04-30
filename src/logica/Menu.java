/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Menu {

    public static Scanner in = new Scanner(System.in);
    public static boolean cond = true;

    public void Menu() {
        do {
            System.out.println("\n---------------CANTANTES---------------\n");
            System.out.println("1. Agregar Cantante");
            System.out.println("2. Mostrar Cantantes");
            System.out.println("3. Editar cantante");
            System.out.println("4. Eliminar cantante");
            System.out.println("5. Mostrar cantantes con discos mas vendidos de mayor a menor");
            System.out.println("6. Salir");
            System.out.println("\n---------------------------------------\n");

            System.out.println("Seleccione la opcion: ");
            int opc = in.nextInt();

            switch (opc) {
                case 1:

//                    ListaCantantesFamosos.agregarCantante();
                    break;

                case 2:

                    if (ListaCantantesFamosos.cantantes.isEmpty()) {
                        System.out.println("No hay cantantes aun!");
                        break;
                    } else {
                        ListaCantantesFamosos.mostrarCantantes();
                        break;
                    }

                case 3:
                    ListaCantantesFamosos.editarCantante();
                    break;
                case 4:

                    if (ListaCantantesFamosos.cantantes.isEmpty()) {
                        System.out.println("No hay cantantes aun.");
                        break;
                    } else {
//                        ListaCantantesFamosos.eliminarCantante();
                        break;
                    }

                case 5:

                    if (ListaCantantesFamosos.cantantesDeMayorAMenor.isEmpty()) {
                        System.out.println("No hay cantantes aun.");
                        break;
                    } else {
                        ListaCantantesFamosos.organizarMayoraMenor();
                        break;
                    }
                case 6:
                    System.out.println("\nHasta luego!");
                    cond = false;
                default:
                    System.out.println("\nIngrese una opcion correcta\n");
                    break;
            }
        } while (cond);

    }

}
