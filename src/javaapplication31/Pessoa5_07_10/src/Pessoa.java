
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;


public class Pessoa {
    private String nome;
    private int idade;
    private double renda;
    int rg;
    protected double valor;
    
    
    public Pessoa (){}
    
    public Pessoa (String nome, int idade, double renda, double valor){
        this.nome = nome;
        this.idade = idade;
        this.renda= renda;
        this.valor = valor;
        
        
        }
    public String getNome(){
        return nome;
    }
    public int getIdade (){
        return idade;
    }
    public double getRenda(){
        return renda;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public void setIdade (int idade){
        this.idade = idade;
    }
    public void setRenda (double renda){
        this.renda= renda;
    }
    public void imprimeDados (){
    JOptionPane.showMessageDialog(null, "mostrar dados " + nome
                    + "/nidade " + idade
                        +"/nreda" + renda);
    
    }
}
