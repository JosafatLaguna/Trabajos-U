
package class5ejercicio1;

    public class Chofer {
    public String nombre;
    public double PPViajes = 50000;
    private double TViajes = 4;

    public double TotalSalario(){
        double Total = 0;
        Total = this.TViajes * this.PPViajes;
        return Total;
    }
    
    public void MostrarResultado(){
        System.out.println("El salario del trabajador es = " + TotalSalario());

    }
}