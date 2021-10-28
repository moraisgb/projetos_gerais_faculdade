
public class Torneio {
    private  String nome;
    private int idade;
    
    Torneio(String n,int i){
       nome = n;
       idade = i;  
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setNome(String n){
        nome= n;
    }
    public void setIdade (int i){
        idade= i;
    }
    public String verificaCategoria(){
        String categoria;
        
        if (idade < 5){
            categoria = null;
        } else if (idade<=7){ 
            categoria = "Infantil";
        } else if (idade <=10){
            categoria = "Juvenil";
        } else if (idade <=15){
            categoria = "Adolescente";
        } else if (idade <= 30){
            categoria = "Adulto";
        } else {
            categoria = "Sênior";
        }
        return categoria;
    }
    public void imprimeDados(){
        System.out.println("Nome: " + nome + " \nIdade: " + idade + " \nCategoria: "+ verificaCategoria());
    }
}



