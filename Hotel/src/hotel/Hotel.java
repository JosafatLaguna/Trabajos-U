/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OUTER:
        while (true) {
            int option = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n1. Reservar Habitación\n2. Mostrar Habitaciones disponibles\n3. Modificar Habitaciones\n4. cerrar\n\nIndique la accion que desea realizar: "));
            if (!(option == 1 || option == 2 || option == 3 || option == 4)) {
                System.out.println("Por favor verifique la informacion introducida");
            } else {
                switch (option) {
                    case 1 -> Reservar();
                    case 2 -> Mostrar();              
                    case 3 -> Modificar ();
                    case 4 -> {break OUTER;}
                }
            }
        }
    }
    
}
