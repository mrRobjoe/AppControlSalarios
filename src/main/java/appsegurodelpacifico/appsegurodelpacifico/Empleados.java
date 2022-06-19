/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appsegurodelpacifico.appsegurodelpacifico;

/**
 *
 * @author joharie Enriquez
 */
public class Empleados {
    //atributos
    private String cedula;
    private String nombreCompleto;
    private int horasNormales;
    private int horasExtras;
    private float salarioBruto;
    private float deducciones;
    private float sueldoNeto;
    
    //métodos set y get para cada atributo
    //método set y get para variable cedula
    public void setCedula(String valor){
        this.cedula=valor;
    }
    public String getCedula(){
        return this.cedula;
    }
    //método set y get para variable nombreCompleto
    public void setNombreCompleto(String valor){
        this.nombreCompleto=valor;
    }
    public String getNombreCompleto(){
        return this.nombreCompleto;
    }
    //método set y get para variable horasNormales
    public void setHorasNormales(int valor){
        this.horasNormales=valor;
    }
    public int getHorasNormales(){
        return this.horasNormales;
    }
    //método set y get para variable horasExtras
    public void setHorasExtras(int valor){
        this.horasExtras=valor;
    }
    public int getHorasExtras(){
        return this.horasExtras;
    }
    //método ADICIONAL set y get para salarioBruto
    public void setSalarioBruto(float valor){
        this.salarioBruto=valor;
    }
    public float getSalarioBruto(){
        return this.salarioBruto;
    }
    //método ADICIONAL set y get para deducciones
    public void setDeducciones(float valor){
        this.deducciones=valor;
    }
    public float getDeducciones(){
        return this.deducciones;
    }
    //
    public void setSueldoNeto(float valor){
        this.sueldoNeto=valor;
    }
    public float getSueldoNeto(){
        return this.sueldoNeto;
    }
    
    //método constructor, inicializar atributos
    public Empleados(){
        this.cedula="cedula empleado";
        this.nombreCompleto="Nombre completo empleado";
        this.horasNormales=0;
        this.horasExtras=0;
    }
    
    //método para calcular el salario bruto
    public void SalarioBruto(){
        this.setSalarioBruto((this.getHorasNormales()*1800)+(this.getHorasExtras()*2700));
    }
    
    //método para calcular las deducciones de ley
    public boolean DeduccionesDeLey(){
        boolean deduccion=false;
        //revisar si el salario bruto es menor igual a 250.000
        if (this.getSalarioBruto()<=250000){
            this.setDeducciones(this.getSalarioBruto()*9/100);
            this.setSueldoNeto(this.getSalarioBruto()-this.getDeducciones());
            deduccion=true;
        }
        else{
            //de no cumplirse la anterior, verificar si salarioBruto es mayor a 250.000 y menor igual a 380.000
           if (this.getSalarioBruto()>250000 && this.getSalarioBruto()<=380000){
               this.setDeducciones(this.getSalarioBruto()*12/100);
               this.setSueldoNeto(this.getSalarioBruto()-this.getDeducciones());
               deduccion=true;
           }
           else{
               //de no cumplirse la anterior condición verificar finalmente si salarioBruto es mayor a 380.000
               if (this.getSalarioBruto()>380000){
                   this.setDeducciones(this.getSalarioBruto()*15/100);
                   this.setSueldoNeto(this.getSalarioBruto()-this.getDeducciones());
                   deduccion=true;
               }
           }
        }
        return deduccion;
    }
}//cierre class
