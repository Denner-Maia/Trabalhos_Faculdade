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
public class OrdenarPorMatricula extends ProfessorPersistenciaTemplateMethod {

    
    //Construtores
    
    public OrdenarPorMatricula() {
    }
    
    public OrdenarPorMatricula(String nomeDoArquivo) {
        super(nomeDoArquivo);
    }

    //--------------------------------------------------------------------------
    
    @Override
    public boolean ePrimeiro(Professor professor1, Professor professor2) {
         if(professor1.getMatricula().compareToIgnoreCase(professor2.getMatricula()) <= 0) return true;
        else return false;
    }
    
    
    
}
