/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minimercado;

import javax.swing.JOptionPane;
/**
 *
 * @author aronm
 */
public class Menu {
    public static void main(String[]args){
        int opcion; 
        
     do{
     opcion=Integer.parseInt(JOptionPane.showInputDialog (null,
                "       Seleccionar una Opción \n"+
                " 1.-Precio con IVA (19%)\n"+
                " 2.-Descuento Carnes (20%)\n"+
                " 3.-Descuento Bebestibles(12%)\n"+
                " 4.-Precio Final Producto\n"+
                " 5.-Total Productos \n"+
                " 0.-Salir"));
             
     switch(opcion){
            case 1: IVA();break;
            case 2: tipoCarne();break;
            case 3: Bebestibles();break;
            case 4: precio_final();break;
            case 5: Total_productos();break;
            case 0: JOptionPane.showMessageDialog(null,"Buen Día");System.exit(0);break;
            default:JOptionPane.showMessageDialog(null,"Elija una Opción válida\n","Error de Opción",JOptionPane.WARNING_MESSAGE);
     } }while(opcion!=5);
    }
      
   public static void tipoCarne(){
            String cad=JOptionPane.showInputDialog ("Ingrese precio del producto");
            String cad2="";
            
   }    
    public static void Bebestibles(){
        
    }        
        

    public static void IVA (){

    }

    public static void precio_final(){
        
    }
    public static void Total_productos(){
        
    }
    public static void Total_pago(){
        
    }}


    
