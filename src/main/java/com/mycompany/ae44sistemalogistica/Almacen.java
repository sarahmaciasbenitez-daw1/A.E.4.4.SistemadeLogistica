/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ae44sistemalogistica;

import java.util.*;

/**
 *
 * @author sarah
 */
public class Almacen {

    private Paquete[][] muelle = new Paquete[3][3];
    private HashSet<String> registroCodigos = new HashSet<>();
    private ArrayList<Paquete> colaSalida = new ArrayList<>();
    private HashMap<String, Integer> estadisticas = new HashMap<>();

    public void recepcionarPaquete(Paquete p, int fila, int col) {
        if (registroCodigos.contains(p.getCodigo())) {
            System.out.println("Error: paquete duplicado -> " + p.getCodigo());
            return;
        }

        if (muelle[fila][col] != null) {
            System.out.println("Error: posición ocupada [" + fila + "," + col + "]");
            return;
        }

        muelle[fila][col] = p;
        registroCodigos.add(p.getCodigo());
        System.out.println("Paquete recibido: " + p);
    }

    public void enviarACamion(int fila, int col) {
        if (muelle[fila][col] == null) {
            System.out.println("No hay paquete en esa posición");
            return;
        }

        Paquete p = muelle[fila][col];
        muelle[fila][col] = null;

        colaSalida.add(p);

        estadisticas.put(p.getDestino(),
                estadisticas.getOrDefault(p.getDestino(), 0) + 1);

        System.out.println("Paquete enviado a camión: " + p);
    }

    public void mantenimientoSeguridad(double pesoMaximo) {
        Iterator<Paquete> it = colaSalida.iterator();

        while (it.hasNext()) {
            Paquete p = it.next();
            if (p.getPeso() > pesoMaximo) {
                System.out.println("Eliminado por exceso de peso: " + p);
                it.remove();
            }
        }
    }

    public void mostrarEstadisticas() {
        System.out.println("\n--- INFORME FINAL ---");
        for (Map.Entry<String, Integer> entry : estadisticas.entrySet()) {
            System.out.println("Destino: " + entry.getKey()
                    + " | Envíos: " + entry.getValue());
        }
    }
}
