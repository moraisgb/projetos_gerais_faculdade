// Aula 2 Ex 2 - Slide 
package testaproduto;

import java.util.Scanner;

public class TestaProduto {

    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
  
         System.out.println (" Digite a marca do produto: ");
         String m = leia.nextLine();
         System.out.println ("Digite o fabricante do produto: ");
         String f = leia.nextLine();
         System.out.println ("Digite o código de barras: ");
         String c = leia.nextLine();
         System.out.println ("Preco do produto");
         Float p = leia.nextFloat();
         
         Produto produto = new Produto (m,f,c,p);
         System.out.println("\n\n\nMarca do produto: " + m + 
                "\nFabricante: " + f + "\nCodigo de barras: " + c 
                 + "\nPreco: "+ p);      
    }
    
}
