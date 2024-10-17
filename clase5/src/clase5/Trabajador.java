package clase5;

public class Trabajador {
    
    //atributos
    public String id;
    public String sexo;
    public int edad;
    private double salario;
    public Integer edad2;
    public Empresa empresa;
    
    public double CalcularSalarioBruto(){
        double Resultado = 0;
        Resultado = this.salario - this.salario * 0.09;
        return Resultado;
    }
        
        public void ImprimaDatosPersonales(){
            System.out.println("El sexo del trabajador es = "+ sexo);
            
        }
    private void CambiarSexo ( String sexo ){
        this.sexo = sexo;
        }
    
}
