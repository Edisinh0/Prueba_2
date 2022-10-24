/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minimercado;

/**
 *
 * @author Alka_
 */
public class Verduras extends Categorias {

    protected int cantidadVitaminas;

    public Verduras() {
    }

    public Verduras(int codigo, int precio, int cantidad, String nombre, int cantidadVitaminas) {
        super(codigo, precio, cantidad, nombre);
        this.cantidadVitaminas = cantidadVitaminas;
    }

    public int getCantidadVitaminas() {
        return cantidadVitaminas;
    }

    public void setCantidadVitaminas(int cantidadVitaminas) {
        this.cantidadVitaminas = cantidadVitaminas;
    }

    @Override
    public String toString() {
        return super.toString() + " Verdura: " + "cantidadVitaminas: " + cantidadVitaminas + "total: " + total();
    }
    
    @Override
    
    public int total() {
    int total = 0;
    total = this.precio * this.cantidad;
    return total;
    
    }
    
}

