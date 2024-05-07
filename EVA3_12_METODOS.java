/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_12_metodos;

/**
 *
 * @author Nahilea
 */
public class EVA3_12_METODOS {

    public static void main(String[] args) {
        //TODO code application logic here
        //Invocar al metodo ---> llamada --> call
        mostrarMensaje("Hola mundo bonito!!!"); 
        mostrarMuchosMensajes("hola!!", 5);
    }
   
    
    //public static --> para la materia de POO
    //void ---> (tipo de dato) valor que regresa el metodo
    //void ---> no regresa nada
    //nombre del metodod ---> identificador valido
    //                        empezar en minusculas, deber ser un verbo
    //() <--- parametros del metodo (argumentos) --> valor que el metodo necesita para funcioanr.
    public static void mostrarMensaje(String mensaje){//encabezado
        ///cuerpo del metodo: aqui va nuestro codigo
        System.out.println(mensaje);
    }
    
    public static void mostrarMuchosMensajes(String mensaje,int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println(mensaje);
            
        }
    }
}
