
package aula5_funcionario;

public class Funcionario {
    int cracha;
    float salario;
    String cargo;
    
    Funcionario(){
        cargo = "assistente";
    }
    Funcionario (int c, float s, String car){
        cracha = c;
        salario = s;
        cargo = car;      
    }
    public void calculaAumento(float porcentagem){
        float aumento = salario * (porcentagem/100);
        salario = salario + aumento;
    }
    public void calculaAumento(int tempo){
        salario = tempo*150 + salario;
    }
}

