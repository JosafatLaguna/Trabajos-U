/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz1;

/**
 *
 * @author Aulas Heredia
 */
public class Matriz {
      
// matriz para generar los la cantidad de productos
      int getProductos [][] = new int [8][5];
            for (int i = 0; i < 8;i++){
                for (int j = 0; j < 5;j++){
                    getProductos [i][j] = (int) (Math.random() * 6);
                    System.out.print("" + getProductos [i][j] +"|");
                 
                }
                System.out.println("");
                
            }   
    }
    
 
