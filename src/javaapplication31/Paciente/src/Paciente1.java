
import javax.swing.JOptionPane;


public class Paciente1 {
    String nome;
    String rg;
    String telefone;
    int anoNascimento;
    String profissao;
    String endereco;
    
    
    
    public Paciente1(){
    }
    
    public Paciente1 (String nome){
        this.nome = nome;
     
        
    }
    
    
    // metodos - é aquilo que cria uma ação 
    public void cadastroDados(){
       nome = JOptionPane.showInputDialog(null,"Digite o nome do paciente: ");
       rg = JOptionPane.showInputDialog(null, "Digite o rg do paciente: ");
       anoNascimento = Integer.parseInt(JOptionPane.showInputDialog (null, "Digite ano de nascimento do paciente:"));
       
    }
    public void imprimeDados (){
        System.out.println ("Dados do paciente"
                             + "\nNome: " + nome
                             + "\nRG: " + rg
                             + "\nano de Nascimento: " + anoNascimento
                             + "\n.........");
        
                
    }
    public int calculeIdade(int anoAtual){
    return anoAtual - anoNascimento;
    }
    
    
}
