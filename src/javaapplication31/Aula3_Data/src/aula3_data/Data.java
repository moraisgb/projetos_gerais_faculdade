
package aula3_data;

import javax.swing.JOptionPane;

public class Data {
    int dia;
    int mes;
    int ano;
       
    Data(){}
    
    Data(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;           
    }
    
    public void cadastraDados(){
        JOptionPane.showMessageDialog(null,"Data cadastrada com sucesso!");
    }
    
    public void impriDados(){
        System.out.println("A data solicitada é: " + dia + "-"
        + mes + "-"+ ano);
    }
}


