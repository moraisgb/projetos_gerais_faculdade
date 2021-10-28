
package testaproduto;

public class Produto {
    String marca;
    String fabricante;
    String codigo_barras;
    float  preco;
    
    Produto () {}
    Produto (String m, String f, String c, float p){
        marca= m;
        fabricante= f;
        codigo_barras= c;
        preco= p;    
    }
}