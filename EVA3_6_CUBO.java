/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_cubo;

/**
 *
 * @author Nahilea
 */
public class EVA3_6_CUBO {

    public static void main(String[] args) {
        //TODO code application logic here
        int cubo[][][] = new int[10][5][3];//150 enteros
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i][j].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    cubo[i][j][k] = (int) (Math.random() *100);  
               }
            }
        }
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    System.out.println("[" + cubo[i][j][k] + "]"); 
                }
        
    
             }
         }
    }
}

