/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabyb
 */
public class Curso {
    String nome;
    String conteudo;
    int codigo_do_curso;
    String periodo;
    
    public Curso(int codigo_do_curso, String nome){
        this.codigo_do_curso = codigo_do_curso;
        this.nome = nome;
    }

}
