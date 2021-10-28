
public class Fornecedor extends Pessoa {

    /**
     * @return the valorCompra
     */
    public float getValorCompra() {
        return valorCompra;
    }

    /**
     * @param valorCompra the valorCompra to set
     */
    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }
    private float valorCompra;
    
    
    public Fornecedor(){
    }
    
    public Fornecedor (float valorCompra){
        this.valorCompra = valorCompra;
    }
    //construtor com todos os atributos, inclusive os que herdou do pai(Pessoa)
    public Fornecedor (float valorCompra, String nome, String fone){
        super (nome, fone);
        this.valorCompra = valorCompra;
        
        
}
    public String toString(){
        return "Nome: " + getNome() + "\nFone: " + getFone() + "\nvalorCompra: " + getValorCompra();
    }
    
    
}
    

