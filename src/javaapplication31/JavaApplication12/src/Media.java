
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabyb
 */
public class Media {
    double nota1;
    double nota2;
    double media;

    public Media (){
    
    }
    public Media (double nota1, double nota2){
        this.nota1 = nota1;
        this.nota2 = nota2;
                
    }
   public void calcularMedia(){
       this.media = (this.nota1 + this.nota2)/2;   
      
   }
   
    public void imprimeMedia (){
    calcularMedia ();
    JOptionPane.showMessageDialog(null, "Dados do Boletim: "
            + "\nNota1: " + nota1
            + "\nNota2: " + nota2
            + "\nMedia: " + media
            + "\nConceito: " + verificaConceito());
    
    
    }
   
    public String verificaConceito () {
        if (this.media >= 8 && this.media <= 10) {
            return "A";
        } else if( this.media >= 6) {
            return "B";
        } else if (this.media >=4) {
            return "C";
        } else {
            return "D";
        }
    }
}
