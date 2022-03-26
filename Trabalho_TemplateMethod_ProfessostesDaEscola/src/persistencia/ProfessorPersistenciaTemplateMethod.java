/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import classededados.Professor;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author dener
 */
public abstract class ProfessorPersistenciaTemplateMethod {
    
    //Atributos 
    
    private String nomeDoArquivo;
    
    //Construtor

    public ProfessorPersistenciaTemplateMethod() {
    }

    public ProfessorPersistenciaTemplateMethod(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }
    
     //Metodos
    public abstract boolean ePrimeiro(Professor professor1, Professor professor2);

    public ArrayList<Professor> listagemDeProfessores()throws Exception{
        try{
            ArrayList<Professor> array = new ArrayList<Professor>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            int pos = 0;
            while((linha=br.readLine())!=null){
                Professor aux = new Professor(linha);
                array.add(aux);
                pos++;
            }
            br.close();
            //algoritmo de Ordenação
            for (int i = 0; i < array.size(); i++) {
                for (int j = i; j < array.size(); j++) {
                    
                    if (!ePrimeiro(array.get(i),array.get(j))) {    
                        Professor temp = array.get(j);
                        array.set(j, array.get(i));
                        array.set(i, temp);
                    }
                }
            }
            return array;
        }catch(Exception erro){
            throw erro;
        } 
    }
}
