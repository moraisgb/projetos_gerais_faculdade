package javaapplication31.Pessoa6.src;


public class Cliente extends Pessoa {
    private float valorDivida;
    
    public Cliente (){
    }
    
    public Cliente (float valorDivida){
        this.valorDivida = valorDivida;
    }
    public Cliente (float valorDivida, String nome, String fone){
        super (nome,fone);
        this.valorDivida = valorDivida;
    }
    public float getValorDivida(){
        return valorDivida;
    }
    public void setValorDivida (float valorDivida){
        this.valorDivida = valorDivida;
    }
    public String toString(){
        return "Nome: " + getNome() + "\nFone: " + getFone() + "\nValor da Divida: " + valorDivida;
    }

    private String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getFone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
