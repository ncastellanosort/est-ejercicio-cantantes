/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class ListaCantantesFamosos {

    public static Scanner in = new Scanner(System.in);

    public static ArrayList<CantanteFamoso> cantantes = new ArrayList<>();

    public static ArrayList<CantanteFamoso> cantantesDeMayorAMenor = new ArrayList<>();

//    public static Iterator<CantanteFamoso> iterador = cantantes.iterator();
    public static void agregarCantante(String nombre, String disco, int totalVentas) {

        cantantes.add(new CantanteFamoso(nombre, disco, totalVentas));
        cantantesDeMayorAMenor.add(new CantanteFamoso(nombre, disco, totalVentas));

//        JOptionPane.showMessageDialog(null, "Agregado Exitosamente");
    }

    public static void eliminarCantanteJframe(int ind) {
        CantanteFamoso cantanteSeleccionado = cantantes.get(ind - 1);
        cantantes.remove(cantanteSeleccionado);
        cantantesDeMayorAMenor.remove(cantanteSeleccionado);
    }

    public static void organizarMayoraMenor(ArrayList array) {
        Collections.sort(array);
    }

    public static String mostrarNombreCantantesJframe() {
        int x = 1;
        ArrayList<String> nombres = new ArrayList();

        for (CantanteFamoso cantante : cantantes) {

            nombres.add(x + ". " + cantante.getNombre());

            x++;
        }

        return nombres.toString();

    }

}
