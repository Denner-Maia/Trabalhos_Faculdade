/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classededados;

/**
 *
 * @author dener
 */
public class Professor{
    //Atributos
    
    private String matricula;
    private String nome;
    private String escola;
    private String titulacao;
    
    //Construtores 

    public Professor() {
    }

    public Professor(String matricula, String nome, String escola, String titulacao) {
        this.matricula = matricula;
        this.nome = nome;
        this.escola = escola;
        this.titulacao = titulacao;
    }
    //Metodos 
    
    public Professor(String str){
        String[] vetor = str.split(";");
        this.matricula = vetor[0];
        this.nome = vetor[1];
        this.escola = vetor[2];
        this.titulacao = vetor[3];
    }
    //Geters e Seters

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    
}
