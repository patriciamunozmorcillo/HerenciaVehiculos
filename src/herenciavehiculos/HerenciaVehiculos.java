/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciavehiculos;

import java.util.ArrayList;

public class HerenciaVehiculos {

    public static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    public static void rellenarDatos() {
        Coche c;
        Camion cam;

        for (int i = 0; i < 10; i++) {
            c = new Coche();
            c.setMarca("Opel " + i);
            c.setNum_puertas(5);
            vehiculos.add(c);

            cam = new Camion();
            cam.setMarca("Volvo" + i);
            cam.setNum_ejes(3);
            vehiculos.add(cam);

        }
    }

    public static void mostrar() {
        for (Vehiculo v : vehiculos) {
            if (v instanceof Coche) {
                System.out.println("Marca: " + v.getMarca());
                System.out.println("Puertas" + ((Coche) v).getNum_puertas());
            }
        }

        for (Vehiculo v : vehiculos) {
            if (v instanceof Camion) {
                System.out.println("Marca: " + v.getMarca());
                System.out.println("Ejes" + ((Camion) v).getNum_ejes());
            }
        }

    }

    public static void main(String[] args) {

        rellenarDatos();
        mostrar();
    }
}
