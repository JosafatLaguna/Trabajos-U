package clase5;

public class Clase5 {

    public static void main(String[] args) {

        //crear un objeto/instancia
        Trabajador esclavo1 = new Trabajador();
        Trabajador esclavo2 = new Trabajador();
        Trabajador pedro = new Trabajador();

        esclavo1.edad = 20;
        esclavo2.edad = 18;
        pedro.edad = 50;
        esclavo1.edad2 = 10;

        System.out.println("esclavo1.edad = " + esclavo1.edad);
        System.out.println("esclavo2.edad = " + esclavo2.edad);
        System.out.println("pedro.edad = " + pedro.edad);
        System.out.println("esclavo1.edad2 = " + esclavo1.edad2.doubleValue());
        
        esclavo1.ImprimaDatosPersonales();
        esclavo2.ImprimaDatosPersonales();
        pedro.ImprimaDatosPersonales();

    }

}
