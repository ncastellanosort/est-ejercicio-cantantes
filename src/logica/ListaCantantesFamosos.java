/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

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

//        System.out.println("Nombre del cantante: ");
//        String nm = JOptionPane.showInputDialog(null, "Nombre del cantante: ");
//
//        String dsc = JOptionPane.showInputDialog(null, "Disco con mas ventas: ");
//        System.out.println("Numero de ventas: ");
//
//        int nmV = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de ventas: "));
        cantantes.add(new CantanteFamoso(nombre, disco, totalVentas));
        cantantesDeMayorAMenor.add(new CantanteFamoso(nombre, disco, totalVentas));

//        JOptionPane.showMessageDialog(null, "Agregado Exitosamente");
    }

    public static void mostrarCantantes() {
        int x = 1;
        for (CantanteFamoso cantante : cantantes) {
            System.out.printf("\n\tCantante %d\n", x);
            System.out.println("Nombre: " + cantante.getNombre() + "\nDisco con mas ventas: " + cantante.getDiscoConMasVentas() + "\nTotal de ventas: " + cantante.getTotalVentas() + "\n");
            x++;
        }

    }

    public static void mostrarNombreCantantes() {
        int x = 1;
        for (CantanteFamoso cantante : cantantes) {
            System.out.println("\nCantante " + x + ". Nombre: " + cantante.getNombre());
            x++;
        }
    }

    public static void mostrarDatosCantante(CantanteFamoso cantante) {
        System.out.println("\nNombre: " + cantante.getNombre() + "\nDisco con mas ventas: " + cantante.getDiscoConMasVentas() + "\nTotal de ventas: " + cantante.getTotalVentas() + "\n");
    }

    public static void editarCantante() {
        mostrarNombreCantantes();

        System.out.println("\nSeleccione el indice del cantante: ");

        int ind = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione el indice del cantante: "));
        CantanteFamoso cantanteSeleccionado = cantantes.get(ind - 1);

        System.out.println("\nEl cantante seleccionado fue: " + cantanteSeleccionado.getNombre());

        System.out.println("\nDatos:");
        mostrarDatosCantante(cantanteSeleccionado);

        System.out.println("\nSeleccione que desea editar");
        System.out.println("1. Nombre");
        System.out.println("2. Disco con mas ventas");
        System.out.println("3. Numero de ventas\n");

        int op = in.nextInt();

        switch (op) {
            case 1:
                System.out.println("\nIntroduzca el nuevo nombre: ");
                String nvNm = in.nextLine();
                cantanteSeleccionado.setNombre(nvNm);
                System.out.println("\nEditado exitosamente!\n");
                break;
            case 2:
                System.out.println("\nIntroduzca el nuevo Disco con mas ventas: ");
                String nvDsc = in.nextLine();
                cantanteSeleccionado.setDiscoConMasVentas(nvDsc);
                System.out.println("Editado exitosamente!\n");
                break;
            case 3:
                System.out.println("\nIntroduzca el numero de ventas: ");
                int nmVn = in.nextInt();
                cantanteSeleccionado.setTotalVentas(nmVn);
                System.out.println("Editado exitosamente!\n");
                break;

        }

    }

    public static void eliminarCantante(String nombre) {
        mostrarNombreCantantes();

        System.out.println("\nSeleccione el indice del cantante: ");
        int ind = in.nextInt();
        CantanteFamoso cantanteSeleccionado = cantantes.get(ind - 1);

        cantantes.remove(cantanteSeleccionado);

        System.out.println("\nCantante eliminado exitosamente!");

    }

    public static void eliminarCantanteJframe(int ind) {
        CantanteFamoso cantanteSeleccionado = cantantes.get(ind - 1);
        cantantes.remove(cantanteSeleccionado);
    }

    public static void organizarMayoraMenor() {
        Collections.sort(cantantesDeMayorAMenor);

        int x = 1;
        for (CantanteFamoso cantante : cantantesDeMayorAMenor) {
            System.out.printf("\n\tCantante %d\n", x);
            System.out.println("Nombre: " + cantante.getNombre() + "\nDisco con mas ventas: " + cantante.getDiscoConMasVentas() + "\nTotal de ventas: " + cantante.getTotalVentas() + "\n");
            x++;
        }

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
    
    public static String datosTablaFrame(int indice){
        return ListaCantantesFamosos.cantantes.get(indice).getNombre() + " " + ListaCantantesFamosos.cantantes.get(indice).getDiscoConMasVentas() +" " + ListaCantantesFamosos.cantantes.get(indice).getTotalVentas();
    
    }

}
