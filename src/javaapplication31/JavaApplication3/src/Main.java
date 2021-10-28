package javaapplication31.JavaApplication3.src;


public class Main {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente n = new Cliente ();
        n.name = "Gaby Barbara";
        n.cpf = "42668791804";
        n.idade = 26;
        
        Curso cr = new Curso(123, "analise");
        cr.periodo = "noturno";
        
        
        System.out.println (n.name + " titular do cpf " + n.cpf + " tem " + n.idade + " anos ");
        System.out.println (" Está matriculada no curso de "+ cr.nome + cr.codigo_do_curso + "no periodo " + cr.periodo
       );
        
                
                
    
        
        
        
        
        
       
                
    }
    
}
