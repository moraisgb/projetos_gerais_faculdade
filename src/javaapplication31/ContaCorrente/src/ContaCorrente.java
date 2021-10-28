package javaapplication31.ContaCorrente.src;


import java.util.Scanner;


public class ContaCorrente {
  String nome;
  float saldo;
  float limites;
  char tipo;
  
  ContaCorrente(){}
  
  ContaCorrente(String n, float s, float l, char t){
      nome = n;
      saldo = s;
      limites = l;
      tipo = t;
      
  }
  public void cadastraDados(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Informe o seu nome: ");
      nome = sc.nextLine();
      System.out.println("Informe o saldo: ");
      saldo= sc.nextFloat();
      System.out.println("Informe o limite: ");
      limites= sc.nextFloat();
      System.out.println("Informe o Tipo, C para conta corrente e P para Poupança");
      tipo = sc.next().charAt(0);
      
  }
   public void imprimeDados(){
       System.out.println("Nome: " + nome + " Saldo: " + saldo
       + " limites: "+ limites + " tipo de conta: " + tipo);
   }   
   public void depositarValor(float valor){
       saldo = saldo+valor;
   }
   public void sacarValor (float valor){
       saldo = saldo-valor;
   }
}
