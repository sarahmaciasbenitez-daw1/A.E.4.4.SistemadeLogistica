/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ae44sistemalogistica;

/**
 *
 * @author sarah
 */
public class Ae44SistemaLogistica {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Almacen almacen = new Almacen();

        System.out.println("--- Recepción ---");
        Paquete p1 = new Paquete("A1", 10.0, "Madrid");
        Paquete p2 = new Paquete("B2", 25.0, "Barcelona");
        Paquete p3 = new Paquete("C3", 5.0, "Valencia");
        Paquete p4 = new Paquete("A1", 15.0, "Sevilla");

        almacen.recepcionarPaquete(p1, 0, 0);
        almacen.recepcionarPaquete(p2, 0, 1);
        almacen.recepcionarPaquete(p3, 1, 0);
        almacen.recepcionarPaquete(p4, 1, 1);

        System.out.println("\n--- cola de salida ---");
        almacen.enviarACamion(0, 0);
        almacen.enviarACamion(0, 1);

        System.out.println("\n--- mantenimiento de seguridad (máx 20kg) ---");
        almacen.mantenimientoSeguridad(20.0);

        almacen.mostrarEstadisticas();
    }
}
