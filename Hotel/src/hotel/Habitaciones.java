/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author Aulas Heredia
 */
public class Habitaciones {
    private int numerohab; //esta no se va a ocupar pero no la elimino por que se me va abajo el codigo y no se el motivo
    private String valorhab;
    public int estadohab;
    
    public int libre = 1;
    public int ocupada = 2;
    public int sucia = 3;
    
    public Habitaciones (int numerohab, String valorhab, int estadohab) {
        this.numerohab = numerohab;
        this.valorhab = valorhab;
        this.estadohab = estadohab;
    }
   
    Habitaciones(String $, String libre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Habitaciones{valor de habitaciones =" + valorhab + ",estado de las habitaciones =" + estadohab + '}';
    }

    public void setNumerohab(int numerohab) {
        this.numerohab = numerohab;
    }

    public void setValorhab(String valorhab) {
        this.valorhab = valorhab;
    }

    public void setEstadohab(int estadohab) {
        this.estadohab = estadohab;
    }

    public int getNumerohab() {
        return numerohab;
    }

    public String getValorhab() {
        return valorhab;
    }

    public int getEstadohab() {
        return estadohab;
    }
    
}
