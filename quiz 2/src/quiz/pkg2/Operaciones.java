/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.pkg2;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */

// Clase para asignar vectores
public class Operaciones {
    public String Registro;
    public int buscarcorredor;
    public String listaparticipante;
    public String eliminarcorredor;
    public String DatosRamdon;     
    private int espaciosOcupados;  
    private final int MAX_ESPACIOS = 30;
    
    public String nombre;
    public int edad;
    public int Ncorredor;
    public double tiempo;
    
// Constructor para poder operar el menu 
    public Operaciones(String Registro, int buscarcorredor, String listaparticipante, String eliminarcorredor, String DatosRamdon) {
        this.Registro = Registro;
        this.buscarcorredor = buscarcorredor;
        this.listaparticipante = listaparticipante;
        this.eliminarcorredor = eliminarcorredor;
        this.DatosRamdon = DatosRamdon;
        
    }
// Estas clase sirve como menu para gestionar los datos
 public void gestion() {
        OUTER:
        while (true) {
                    int option = Integer.parseInt(JOptionPane.showInputDialog("Menu:\n1. Registro de Corredor\n2. Mostrar Corredores\n3.Eliminar Participante\n4.Salir\n\nIndique la accion que desea realizar: "));
        if  (!(option == 1 || option == 2 || option == 3 ||option == 4)) {
            System.out.println("Por favor verifique la informacion introducida");
        } else {
            switch (option) {
                case 1 -> Registro();
                case 2 -> mostrarCorredores();
                case 3 -> eliminarcorredor();
                case 4 -> {break OUTER;}      
                
            }
        }
        }
    }
    
    
    // Clase para agregar corredores, si hay espacio disponible
    public boolean Registro() {
        while (true){
            nombre = JOptionPane.showInputDialog("Nombre del Corredor:");
            this.nombre = listaparticipante;
            System.out.println("Corredor agregado Correctamente");
            return false;
    // nota
    // Por falta de tiempo y por que no me dio chanse de revisar la materia no lo pude terminar
    // pero le dejo una idea de lo que tenia pensado hacer, mediante un ciclo while, queria almacenar los datos en el vectos de listaparticipante
        }
        
        
    }
    // despues de agregar los datos esta clase sirve para mostrar los datos ingresados
    public void mostrarCorredores() {
        System.out.println("Corredores: " + listaparticipante);
        
    }
    // esta clase sirve para poder eliminar corredores.
    public boolean eliminarcorredor() {
        if (espaciosOcupados > 0) {
            espaciosOcupados--;
            System.out.println("Corredor eliminado " + listaparticipante + ". Espacios utilizados: " + espaciosOcupados);
            return true;
        } else {
            System.out.println("No hay corredor para eliminar" + listaparticipante);
            return false;
        }
    }
    // gettters 
    public int listaparticipante() {
        return espaciosOcupados;
                
    }

    public String getRegistro() {
        return Registro;
    }

    public int getmostrarCorredores() {
        return buscarcorredor;
    }

    public String getListaparticipante() {
        return listaparticipante;
    }

    public String getEliminarcorredor() {
        return eliminarcorredor;
    }

    public String getDatosRamdon() {
        return DatosRamdon;
    }

    public int getMAX_ESPACIOS() {
        return MAX_ESPACIOS;
    }

    public int getBuscarcorredor() {
        return buscarcorredor;
    }

    public int getEspaciosOcupados() {
        return espaciosOcupados;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNcorredor() {
        return Ncorredor;
    }

    public double getTiempo() {
        return tiempo;
    }
    
    

    private String addingName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
   
}
    
   

    

