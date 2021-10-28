package javaapplication31.Curso1.src;


import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Digite o número da tabuada: "); //escreva de algoritmo
        int x = sc.nextInt (); //leia
        
        for (int i =0; i <= 10; i ++){
        
    System.out.println (x + "*" + i + "=" + x*i ); 
    }
    }
    
}
