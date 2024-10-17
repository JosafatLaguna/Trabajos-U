
package class5ejercicio1;

import javax.swing.JOptionPane;

public class Carro {
    public int Llantas = 4;
    public int Pasajeros = 5;
    public int puertas = 4;
    public Modelo modelo;
    
    
public void CarroModelo(){
    System.out.println("El modelo del carro es = " + modelo);

}
public void Modeloydetalles(){
    System.out.println("El modelo del carro es " + CarroModelo());
}
}
