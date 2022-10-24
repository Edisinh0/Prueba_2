/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minimercado;

import java.util.ArrayList;
import static com.mycompany.minimercado.Calculos.IVA;

/**
 *
 * @author Alka_
 */
public class Carrito {

    ArrayList<Categorias> listaProductos = new ArrayList<>();

  
    

    public void listar() {
        for (Categorias temp : listaProductos) {
            System.out.println(temp);

        }

    }

    public void eliminar(Categorias categorias) {
        listaProductos.remove(categorias);

    }

    public int totalpago() {

        int totalPago = 0;
        for (Categorias temp : listaProductos) {
            totalPago = totalPago + temp.total();
        }

        return (int) (totalPago * IVA);

    }
    
    public void agregarProducto(Categorias categorias){

        if(this.listaProductos.contains(categorias)){
            System.out.println("el producto ya existe, no se puede agregar");
        }else{
            listaProductos.add(categorias);

        }

    }
    
}
