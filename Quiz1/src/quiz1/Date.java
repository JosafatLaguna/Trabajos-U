/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz1;

/**
 *
 * @author Aulas Heredia
 */
public class Date {
    // creamos las variables para almacenar los datos
    public int productos; //variable para productos
    public final int MAX_PRODUCTOS = 5; //fijamos un maximo de 5 productos
    public int total; //esta variable sera para almacenar la suma total de los productos vendidos
    public int mayor_venta; //esta variable sera para almacenar que dia se hizo la mayor venta
    
    // Constructor, se comienza con 0 productos
    public Date(int productos) {
        this.productos = 0;
    }
    
    //constructor para agregar productos
    public boolean AgregarProductos() {
        if (productos < MAX_PRODUCTOS) {
            productos++;
            System.out.println("Producto agregado " + productos + ". Espacios utilizados: " + MAX_PRODUCTOS);
            return true;
        } else {
            System.out.println("No hay espacios disponibles " + MAX_PRODUCTOS);
            return false;
        }
    }
    //setters y getters
    public Date(int productos, int total, int mayor_venta) {
        this.productos = productos;
        this.total = total;
        this.mayor_venta = mayor_venta;
    }

    public int getProductos() {
        return productos;
    }

    public int getTotal() {
        return total;
    }

    public int getMayor_venta() {
        return mayor_venta;
    }
    

    public int getMAX_PRODUCTOS() {
        return MAX_PRODUCTOS;

    }

    public void setProductos(int productos) {
        this.productos = productos;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setMayor_venta(int mayor_venta) {
        this.mayor_venta = mayor_venta;
    }

}
