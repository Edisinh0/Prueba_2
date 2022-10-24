/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.minimercado;



/**
 *
 * @author Alka_
 */
public class Minimercado {

    public static void main(String[] args) {
       
    Carrito carrito = new Carrito();
    Carnes carne1 = new Carnes(1, 3000,2, "Huachalomo", "Vacuno");
    Carnes carne2 = new Carnes(1, 3000,2, "Huachalomo", "Vacuno");
    Verduras verdura1 = new Verduras(2, 1500,4,  "Palta", 500);
    Bebestibles bebestible1 = new Bebestibles(3, 1000, 1, "Coca Cola", "lata");

        carrito.agregarProducto(carne1);
        carrito.agregarProducto(carne2);
        carrito.agregarProducto(verdura1);
        carrito.listar();
        System.out.println("*****");
        System.out.println("Total a pagar: " + carrito.totalpago());
        System.out.println("*****");


    }
    
    
    
}