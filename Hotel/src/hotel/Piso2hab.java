/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author Aulas Heredia
 */
public class Piso2hab {
    private int numerohab2; //esta no se va a ocupar pero no la elimino por que se me va abajo el codigo y no se el motivo
    private String valorhab2;
    public int estadohab2;
    
    public int libre = 1;
    public int ocupada = 2;
    public int sucia = 3;
    
    public Piso2hab (int numerohab2, String valorhab2, int estadohab2) {
        this.numerohab2 = numerohab2;
        this.valorhab2 = valorhab2;
        this.estadohab2 = estadohab2;
    }

    Piso2hab(String $, String libre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Habitaciones{valor de habitaciones =" + valorhab2 + ",estado de las habitaciones =" + estadohab2 + '}';
    }

    public int getNumerohab2() {
        return numerohab2;
    }

    public String getValorhab2() {
        return valorhab2;
    }

    public int getEstadohab2() {
        return estadohab2;
    }

    public void setNumerohab2(int numerohab2) {
        this.numerohab2 = numerohab2;
    }

    public void setValorhab2(String valorhab2) {
        this.valorhab2 = valorhab2;
    }

    public void setEstadohab2(int estadohab2) {
        this.estadohab2 = estadohab2;
    }
    
}