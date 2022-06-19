/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appsegurodelpacifico.appsegurodelpacifico;

/**
 *
 * @author Joharie Enriquez
 */
//importación de libreria
import javax.swing.JOptionPane;
public class MenuEmpleados {
    //declarar la variable objeto
    private Empleados varEmpleados;
    
    //mostrar opciones
    public void MostrarMenu(){
        String opcionesMenu="";
        int opcion=0;
        float montoPlanilla=0;
        //crear instancia de objeto
        this.varEmpleados=new Empleados();
        
        //crear opciones de menu
        opcionesMenu+="***Sistema de control de salarios***\n";
        opcionesMenu+="Escoja una opción:\n";
        opcionesMenu+="1.Incluir empleado\n";
        opcionesMenu+="2.Mostrar el cálculo del salario bruto\n";
        opcionesMenu+="3.Mostrar el cálculo deducciones de ley\n";
        opcionesMenu+="4.Mostrar la información del empleado\n";
        opcionesMenu+="5.Salir";
        
        //Loop
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null, opcionesMenu));
            //
            switch(opcion){
                //proceso
                case 1:
                    //proceso para pedir datos de empleado y guardarlos en objeto
                    this.varEmpleados.setCedula(JOptionPane.showInputDialog("Digite su cédula"));
                    this.varEmpleados.setNombreCompleto(JOptionPane.showInputDialog("Digite su nombre completo"));
                    this.varEmpleados.setHorasNormales(Integer.parseInt(JOptionPane.showInputDialog
                    ("Digite la cantidad de horas normales")));
                    this.varEmpleados.setHorasExtras(Integer.parseInt(JOptionPane.showInputDialog
                    ("Digite la cantidad de horas extras")));
                    break;
                case 2:
                    //proceso para calcular el salario bruto
                    this.varEmpleados.SalarioBruto();
                    JOptionPane.showMessageDialog
                    (null, "El cálculo del salario bruto de " +this.varEmpleados.getNombreCompleto()+ 
                            " es de " +this.varEmpleados.getSalarioBruto());
                    break;
                case 3:
                    //proceso para calcular las deducciones
                    this.varEmpleados.DeduccionesDeLey();
                    JOptionPane.showMessageDialog(null, "El cálculo deducciones de ley para " 
                            +this.varEmpleados.getNombreCompleto()+ " es de " +this.varEmpleados.getDeducciones()); 
                    break;
                case 4:
                    //proceso para mostrar la información del empleado
                    JOptionPane.showMessageDialog(null, "Cédula: "+this.varEmpleados.getCedula() + 
                            "\nNombre Completo: " +this.varEmpleados.getNombreCompleto() + 
                            "\nHoras Normales: " +this.varEmpleados.getHorasNormales() +
                            "\nHoras extras: " +this.varEmpleados.getHorasExtras() +
                            "\nSalario Bruto: " +this.varEmpleados.getSalarioBruto() +
                            "\nDeducciones: " +this.varEmpleados.getDeducciones() +
                            "\nSalario neto: " +this.varEmpleados.getSueldoNeto()); 
                    //calcular monto de planilla y dar a conocer el monto recaudado
                    montoPlanilla=montoPlanilla+this.varEmpleados.getSueldoNeto();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "El monto total de la planilla es: " +montoPlanilla);        
                    break;
            }
        //condición de repetición    
        }while(opcion!=5);
    }
}//cierre class
