/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import classededados.Professor;

/**
 *
 * @author dener
 */
public class Ordenar_Por_Titulacao_E_Matricula extends ProfessorPersistenciaTemplateMethod{
     //Construtores
   
    public Ordenar_Por_Titulacao_E_Matricula() {
    }
    
    public Ordenar_Por_Titulacao_E_Matricula(String nomeDoArquivo) {
        super(nomeDoArquivo);
    }

    //--------------------------------------------------------------------------
    //metodos
    
    @Override
    public boolean ePrimeiro(Professor professor1, Professor professor2) {
         if(professor1.getTitulacao().compareToIgnoreCase(professor2.getTitulacao()) == 0)
             return professor1.getMatricula().compareToIgnoreCase(professor2.getMatricula())<= 0;
        return professor1.getTitulacao().compareToIgnoreCase(professor2.getTitulacao()) < 0;
    }
}
