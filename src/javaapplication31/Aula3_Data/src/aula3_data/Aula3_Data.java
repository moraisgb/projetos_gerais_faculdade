
package aula3_data;

public class Aula3_Data {
    
    public static void main(String[] args) {
        Data d1 = new Data ();
        d1.dia= 17;
        d1.mes=11;
        d1.ano=1994;
        
        Data d2 = new Data (26,8,1992);
        
        d1.cadastraDados();
        d1.impriDados();
        
        d2.cadastraDados();
        d2.impriDados();
    }
    
}
