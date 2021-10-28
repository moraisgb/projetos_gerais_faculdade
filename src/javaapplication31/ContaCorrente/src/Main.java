package javaapplication31.ContaCorrente.src;


import java.util.Scanner;

public class Main { 
    
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        c1.cadastraDados();
        
        ContaCorrente c2 = new ContaCorrente("Samantha", 1000, 600,'C');
        
        c1.imprimeDados();
        System.out.println("Digite o valor para depositar: ");
        Scanner sc = new Scanner(System.in);
        c1.depositarValor(sc.nextFloat());
        
        
        c2.imprimeDados();
        System.out.println("Digite valor desejado para saque:");
        c2.sacarValor(sc.nextFloat());       
    }   
}
