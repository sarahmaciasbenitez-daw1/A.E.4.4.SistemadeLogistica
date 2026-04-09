/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ae44sistemalogistica;

import java.util.Objects;

/**
 *
 * @author sarah
 */
public class Paquete {

    private String codigo;
    private double peso;
    private String destino;

    public Paquete(String codigo, double peso, String destino) {
        this.codigo = codigo;
        this.peso = peso;
        this.destino = destino;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }

    public String getDestino() {
        return destino;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Paquete)) {
            return false;
        }
        Paquete paquete = (Paquete) o;
        return Objects.equals(codigo, paquete.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Paquete{"
                + "codigo='" + codigo + '\''
                + ", peso=" + peso
                + ", destino='" + destino + '\''
                + '}';
    }
}
