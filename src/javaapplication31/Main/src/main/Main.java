
package main;

public class Main {

   
    public static void main(String[] args) {
       Triangulo t1 = new Triangulo (4,5);
       Triangulo t2 = new Triangulo ();
       
       t2.altura = 6;
       t2.base = 4;
       
       t2.imprimeDados();
    }  
}