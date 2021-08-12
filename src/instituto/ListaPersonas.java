/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instituto;

/**
 *
 * @author DESKTOP
 */
public class ListaPersonas {

    public double promedioEdad(Personas[] p) {
        double sumEdad = 0;

        for (Personas r : p) {
            sumEdad = sumEdad + r.getEdad();
        }

        double resultado = sumEdad / p.length;
        return resultado;
    }

    public double edadMax(Personas[] p) {
        double edadmax = 0;

        for (Personas r : p) {
            edadmax = edadmax + r.getEdad();
        }
        return edadmax;
    }
}
