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
public class PrincipalEmpleados {
    public static void main(String args[]){
        //variable tipo objeto
        MenuEmpleados varMenu;
        //instancia del objeto
        varMenu=new MenuEmpleados();
        //utilizar método de objeto
        varMenu.MostrarMenu();
        //Finalizar App
        System.exit(0);
    }//cierre main
}//cierre class
