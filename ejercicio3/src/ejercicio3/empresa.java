/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author Aulas Heredia
 */
public class empresa {
    //crear un enum que tenga como datos si es una empresa: contable, farmacia, automotriz, desarrollodesoftware
    
    public String PatosSA;
    public String departamento_1;
    public String departamento_2;
    public String departamento_3;
    public String departamento_4;

    public void setPatosSA(String PatosSA) {
        this.PatosSA = PatosSA;
    }

    public void setDepartamento_1(String departamento_1) {
        this.departamento_1 = departamento_1;
    }

    public void setDepartamento_2(String departamento_2) {
        this.departamento_2 = departamento_2;
    }

    public void setDepartamento_3(String departamento_3) {
        this.departamento_3 = departamento_3;
    }

    public void setDepartamento_4(String departamento_4) {
        this.departamento_4 = departamento_4;
    }

    public String getPatosSA() {
        return PatosSA;
    }

    public String getDepartamento_1() {
        return departamento_1;
    }

    public String getDepartamento_2() {
        return departamento_2;
    }

    public String getDepartamento_3() {
        return departamento_3;
    }

    public String getDepartamento_4() {
        return departamento_4;
    }
   
    
    public enum estados{
        contable,
        farmacia,
        automotriz,
        desarrolladordesoftware
    }
}
