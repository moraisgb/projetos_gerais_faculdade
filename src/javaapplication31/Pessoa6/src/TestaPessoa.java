package javaapplication31.Pessoa6.src;


public class TestaPessoa {

    
    public static void main(String[] args) {
      Cliente c = new Cliente (1000, "João", "99999-9999");
      System.out.println (c.toString());
      
      Fornecedor f = new Fornecedor (4000, "Mappin", "9999-9999");
      System.out.println (f.toString());
      
    }
    
}
