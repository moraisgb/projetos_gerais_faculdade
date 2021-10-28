package javaapplication31.Aula5_Vendedor.src;


public class Vendedor {
    private float vendas;
    private float salario;
    private String nome;
    private int falta;
    
    Vendedor(float vendas, float salario, String nome, int falta){
        this.vendas = vendas;
        this.salario = salario;
        this.nome = nome;
        this.falta = falta;   
    }
    
    public float getVendas(){
        return vendas;
    }
    public float getSalario(){
        return salario;
    }
    public String getNome(){
        return nome;
    }
    public int getFalta(){
        return falta;
    }
    public void setVendas( float vendas){
        this.vendas = vendas;       
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setFalta(int falta){
        this.falta = falta;
    }
    public float calcularComissao(){
        float comissao = 0;
        if (vendas >= 1000 && vendas <2000) {
            comissao = vendas*0.1f;
        } else if(vendas >=2000) {
            comissao = vendas*0.15f;
        }
        return comissao;
    } 
     public void imprimiDados(){
       System.out.println("Vendedor(a): " + nome + "venda de R$: "
       + vendas + "\nComissão de R$ "+ calcularComissao()+
               "\nDesconto por falta: R$: " + descontoFalta() +
               "\nSalario atualizado: " + salario);
       
     }
     public float descontoFalta(){
       return (salario/30)*falta;  
     }
     public void calcularSalario(){
     salario = (salario+ calcularComissao()-descontoFalta());
     }        
}
