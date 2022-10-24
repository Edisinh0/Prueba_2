/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minimercado;
import static com.mycompany.minimercado.Calculos.DESCUENTOS_BEBESTIBLES;
/**
 *
 * @author Alka_
 */
public class Bebestibles extends Categorias {

    protected String formato;

    public Bebestibles() {
    }

    public Bebestibles(int codigo, int precio, int cantidad, String nombre, String formato) {
        super(codigo, precio, cantidad, nombre);
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return super.toString() + " Bebestible: " + "formato: " + formato + "total: " + total();
    }
    
    @Override
    
    public int total() {
        float total = 0;
        total = (this.precio * this.cantidad) * (float)DESCUENTOS_BEBESTIBLES ;
        return (int)total;
    
    }
}
