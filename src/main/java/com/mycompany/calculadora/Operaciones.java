package com.mycompany.calculadora;
public class Operaciones {
 public double sumar(double n1,double n2){
     return n1 + n2;
 } 
 public double restar(double n1,double n2){
     return n1 - n2;
 }
 public double multiplicar(double n1,double n2){
     return n1 * n2;
 }
 public double dividir(double n1,double n2){
     if(n2 !=0){
       return n1/n2;  
     }else{
         System.out.println("error.division por cero"); 
         return 0;
     } 
 }
}
