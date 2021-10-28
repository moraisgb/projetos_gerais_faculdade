/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31.ContaPupanca.src.contapupanca;

import javax.swing.JOptionPane;

/**
 *
 * @author gabyb
 */
public class ContaP {
    // atributos 
    String agencia;
    String numero;
    float saldo;
    float taxa;
    
    ContaP () {}
    
    ContaP (String agencia,String numero, float saldo,float taxa){
     this.agencia = agencia;
     this.numero = numero;
     this.saldo = saldo;
     this.taxa = taxa;
    
    }
   // metodos
    
    void imprimeDados(){
    JOptionPane.showMessageDialog(null, "Dados da Conta Corrente"+
            "\nAgência: " + agencia + "\nSaldo: " + saldo +
            "\nTaxa: " + taxa);
    
    
    }
    void depositar (float valor) {
    saldo = saldo + valor;
    
    }
    float calculaRendimento (){
            float rendimento;
            rendimento = saldo * taxa / 100;
            return rendimento;
    }
            
           
    
}
