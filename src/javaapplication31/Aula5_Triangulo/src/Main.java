package javaapplication31.Aula5_Triangulo.src;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       Triangulo t1 = new Triangulo (5,6);
       Triangulo t2 = new Triangulo ();
        
       t1.imprimeDados();
       
      Scanner sc = new Scanner(System.in);
      System.out.println("Informe a altura:");
      double altura = sc.nextDouble();
      System.out.println("Informe a base:");
      double base = sc.nextDouble();
      t2.setAltura(altura);
      t2.setBase(base);
      t2.imprimeDados();
    }
}
