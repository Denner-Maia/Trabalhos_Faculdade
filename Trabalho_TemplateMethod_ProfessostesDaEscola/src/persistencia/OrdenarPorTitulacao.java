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
public class OrdenarPorTitulacao extends ProfessorPersistenciaTemplateMethod{

    //Construtores
    
    public OrdenarPorTitulacao() {
    }
    
    public OrdenarPorTitulacao(String nomeDoArquivo) {
        super(nomeDoArquivo);
    }

    @Override
    public boolean ePrimeiro(Professor professor1, Professor professor2) {
        if(professor1.getTitulacao().compareToIgnoreCase(professor2.getTitulacao()) <= 0) return true;
        else return false;
    }
    
    
    
    
}
