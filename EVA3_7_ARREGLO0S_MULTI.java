/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_arreglos_multi;

/**
 *
 * @author Nahilea
 */
public class EVA3_7_ARREGLOS_MULTI {

    public static void main(String[] args) {
        //TODO code application logic here
        int matriz[] []= new int[3][2];
        matriz [0][0] = 100;
        matriz [1][0] = 200;
        matriz [2][0] = 300;
        matriz [0][1] = 400;
        matriz [1][1] = 500;
        matriz [2][1] = 600;
        
        System.err.println("matriz lenght -" + matriz.length);
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz " + i + ")" + j +") = " + matriz[i][j]); 
            }
        
        
    }
        
        
        
    }
}
