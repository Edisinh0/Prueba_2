/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minimercado;
import static com.mycompany.minimercado.Calculos.DESCUENTO_CARNE;

/**
 *
 * @author Alka_
 */
public class Carnes extends Categorias{
    
    protected String tipoCarne;

    public Carnes() {
    }

    public Carnes(int codigo, int precio,int cantidad, String nombre, String tipoCarne) {
        super(codigo, precio, cantidad, nombre);
        this.tipoCarne = tipoCarne;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    
    @Override   
    public int total() {
        float total = 0; 
        total = (this.precio * this.cantidad) * (float)DESCUENTO_CARNE;
        return (int)total;
    }
    
    
    @Override
    public String toString() {
        return  super.toString() + " Carne: " + "tipoCarne: " + tipoCarne + "total: " + total();
    }
}

 
    
    
 
