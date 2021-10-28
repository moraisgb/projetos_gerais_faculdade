
package javaapplication31.ContaPupanca.src.contapupanca;

import javax.swing.JOptionPane;

public class ContaPupanca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        float valorDep, rend, saldo,taxa;
        String agencia, num;
        
        agencia = JOptionPane.showInputDialog ("Digite o numero da agência: ");
        num = JOptionPane.showInputDialog ("Digite o numero da Conta Poupança: '");
        saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo: "));
        taxa = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de juros: '"));
        
        ContaP  cp = new ContaP (agencia, num, saldo, taxa);
        
        // Utilização dos métodos para o objeto do tipo Conta Poupança 
        
        cp.imprimeDados ();
        rend=cp.calculaRendimento();
        JOptionPane.showConfirmDialog(null, "O rendimento é: " + rend);
        valorDep = Float.parseFloat (JOptionPane.showInputDialog("Digite o valor a ser depositado: "));
        cp.depositar(valorDep);
        cp.imprimeDados();   
    }
}
