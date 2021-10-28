package javaapplication31.Aula_1_ex1.src;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabyb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p = new Pessoa ();
        p.nome = "Gaby";
        p.idade = 26;
        
        Caes c = new Caes();
        c.nome = "king";
        c.idade = 2;
        
        System.out.println (" A pessoa " + p.nome + "temm" + p.idade + "anos");
        System.out.println (" Tem um cachorro chamado " + c.nome + c.idade);
        
        
            
                
    }
    
}
