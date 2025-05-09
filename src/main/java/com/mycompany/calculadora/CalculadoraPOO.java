/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author espe
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //para leer los datos
        Operaciones op=new Operaciones(); //llamo ala clase operaciones  
        double n1,n2;  //definir las variable 
        int opci = 0 ; //definir la variable de la opcion 
        do{   //menu
        System.out.println("CALCULADORA EN JAVA ");  //opciones del menu
            System.out.println("1:SUMAR");  //opciones del menu de la suma
            System.out.println("2:RESTAR"); //opciones del menu de la resta 
            System.out.println("3:MULTIPLICAR"); //opciones del menu la multiplicacion
            System.out.println("4:DIVIDIR"); //opciones del menu dividir
            System.out.println("5:SALIR"); //opciones del menu salir
            System.out.println("INGRESE UNA OPCION"); //pide al usuario ingresar una opcion
            opci=scanner.nextInt(); //leer la opcion del usuario
                switch (opci){   // menu 
                    case 1:  //caso 1  de la suma
                        System.out.println("ingrese primer digito ");//pide priemr digito
                n1=scanner.nextDouble();//lee el dato
                System.out.println("ingrese segundo  digito ");
                n2=scanner.nextDouble();//lee segundo digito
                        System.out.println(" RESULTADO " +op.sumar(n1, n2)); //muestar reultado de la suma
                        break;                     
                    case 2: //caso 2 
                        System.out.println("ingrese primer digito ");
                n1=scanner.nextDouble();
                System.out.println("ingrese segundo  digito ");
                n2=scanner.nextDouble();
                         System.out.println(" RESULTADO " +op.restar(n1, n2)); //pide priemr digito
                        break;
                    case 3: //casoo 3
                        System.out.println("ingrese primer digito "); //pide priemr digito
                n1=scanner.nextDouble();//lee el primer digito de la multiplicacion
                System.out.println("ingrese segundo  digito ");//pide el segundo digito de laa multiplicacion
                n2=scanner.nextDouble();
                         System.out.println("RESULTADO " +op.multiplicar(n1, n2));//museatr el resultado de la multiplicacion
                        break;
                    case 4: //caso 4
                        System.out.println("ingrese primer digito ");//pide priemr digito
                n1=scanner.nextDouble();//lee el primerr digito de la division
                System.out.println("ingrese segundo  digito ");//pide segundo digito
                n2=scanner.nextDouble();//lee el segundo digito de la division
                         System.out.println("RESULTADO " +op.dividir(n1, n2));//muestra el resultado de la division
                        break;
                    case 5: //caso 5
                         System.out.println("SALIENDO"); //opcion de error cuando ingrese otra opcion no valida
                        break;
                    case 6:
                    default:
                         System.out.println("OPCION INVALIDA ");//validacion del menu
                        break;
                        
                }
        }while(opci !=5);  //cierra el proram asta la opsion 5 
    }
}