/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ae44sistemalogistica;

/**
 *
 * @author sarah
 */
public class Main {

    public static void main(String[] args) {

        Almacen almacen = new Almacen();

        Paquete p1 = new Paquete("A1", 10, "Madrid");
        Paquete p2 = new Paquete("B2", 25, "Barcelona");
        Paquete p3 = new Paquete("C3", 5, "Valencia");
        Paquete p4 = new Paquete("A1", 15, "Sevilla");

        almacen.recepcionarPaquete(p1, 0, 0);
        almacen.recepcionarPaquete(p2, 0, 1);
        almacen.recepcionarPaquete(p3, 1, 0);
        almacen.recepcionarPaquete(p4, 1, 1);

    }
}
