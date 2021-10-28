package javaapplication31.Aula5_Triangulo.src;


import javax.swing.JOptionPane;

public class Triangulo {
    private double base;
    private double altura;
    
    Triangulo(){}
    
    Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;    
    }
    public double getBase(){
        return base;
}
    public double getAltura(){
        return altura;
    }
    public void setBase(double base){
        this.base= base;
    }
    public void setAltura(double altura){
        this.altura= altura;
    }
    
    private double calculaArea(){
        return (base*altura)/2;
    }
    public void imprimeDados(){
        JOptionPane.showMessageDialog(null," A área do triangulo é " + calculaArea());
    }  
}
