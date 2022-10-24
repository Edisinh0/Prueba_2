/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minimercado;

import java.util.Objects;

/**
 *
 * @author Alka_
 */
public abstract class Categorias implements Calculos{
    
     //crear atributos
    protected int codigo, precio, cantidad;
    protected String nombre;

    //constructores
    public Categorias() {
    }

    public Categorias(int codigo, int precio,int cantidad, String nombre) {
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto" + "codigo: " + codigo + ", precio: " + precio + ", cantidad: " + cantidad +", nombre: " + nombre;
    }

    public abstract int total();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.codigo;
        hash = 89 * hash + this.precio;
        hash = 89 * hash + this.cantidad;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categorias other = (Categorias) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.precio != other.precio) {
            return false;
        }
        if (this.cantidad != other.cantidad) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    
    
    
}