/*
exercicio aula 4 - Paciente 
 */
public class Main {

    public static void main(String[] args) {
        Paciente1 p = new Paciente1 (); // objeto sem parametro
        
        Paciente1 p2 = new Paciente1 ("Gaby"); // objeto com parametro
         
        
        
         // metodos e ações 
        p.cadastroDados();
        p.imprimeDados();
        
        System.out.println ("Idade: " + p.calculeIdade(2021)); // p é o objeto que executa o método
        
       p2.imprimeDados();
       
        
        
    
    }
    
}
