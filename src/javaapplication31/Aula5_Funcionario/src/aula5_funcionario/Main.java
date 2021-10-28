
package aula5_funcionario;

public class Main {


    public static void main(String[] args) {
       Funcionario f2 = new Funcionario (12345,2000,"vendedor");
       f2.calculaAumento(2);
       System.out.print("O salario do funcionário " + f2.salario);
    }
    
}
