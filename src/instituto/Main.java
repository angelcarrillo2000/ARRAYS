/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instituto;

import instituto.ListaPersonas;
import instituto.Personas;
import java.util.Scanner;

/**
 *
 * @author DESKTOP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        //creo arreglo de personas
        System.out.println("Cuantas personas desea almacenar?");
        int numPersonas = leer.nextInt();
        Personas[] lista = new Personas[numPersonas];
        String nombre = "";
        double edad = 0;
        int numeroPersona = 1;
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Ingresa nombre para persona" + numeroPersona);
            nombre = leer2.nextLine();

            System.out.println("Ingresa edad para persona" + numeroPersona);
            edad = leer.nextInt();

            Personas p1 = new Personas();
            p1.setNombre(nombre);
            p1.setEdad(edad);
            //agrego el objeto 1 al arreglo personasd
            lista[i] = p1;
            numeroPersona++;

        }
        System.out.println("Desea presentar la lista de Personas? 1=S 2=N");

        int presentar = leer.nextInt();
        switch (presentar) {
            case 1:
                System.out.println("Lista de Peronas:");
                System.out.println("**********************************");
                numeroPersona = 1;
                for (int j = 0; j < lista.length; j++) {
                    System.out.println("persona" + numeroPersona + ":");
                    System.out.println("Nombre: " + lista[j].getNombre() + " Edad: " + lista[j].getEdad());
                    numeroPersona++;

                }
                System.out.println("************************************");
        }
//// REALIZADO EN CLASES 
////creo  objeto de tipo persona
//        Personas p1 = new Personas();
//        p1.setNombre("Luis");
//        p1.setEdad(100);
//        //agrego el objeto 1 al arreglo personasd
//        lista[0] = p1;
//
//        Personas p2 = new Personas();
//        p2.setNombre("Pedro");
//        p2.setEdad(80);
//        lista[1] = p2;

        System.out.println("QUE ACCION DESEA REALIZAR");
        System.out.println("1 Calcular promedio");
        System.out.println("2 Calcular edad maxima");
        System.out.println("3  Agregar una nueva persona a la lista");
        int accion = leer.nextInt();
        ListaPersonas lPersonas = new ListaPersonas();
        switch (accion) {
            case 1:
                double resultado = lPersonas.promedioEdad(lista);
                System.out.println("El promedio es: " + resultado);
                break;
            case 2:
                double resultado2 = lPersonas.edadMax(lista);

                break;

            default:
                System.out.println("No esxiste esta operacion");

        }
    }
}
