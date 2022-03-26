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
public class OrdenarPorNome extends ProfessorPersistenciaTemplateMethod{

    //Construtores
    public OrdenarPorNome() {
    }
    
    public OrdenarPorNome(String nome) {
        super(nome);
    }

    @Override
    public boolean ePrimeiro(Professor professor1, Professor professor2) {
          if(professor1.getNome().compareToIgnoreCase(professor2.getNome()) <= 0) return true;
        else return false;
    }
    
    
}
