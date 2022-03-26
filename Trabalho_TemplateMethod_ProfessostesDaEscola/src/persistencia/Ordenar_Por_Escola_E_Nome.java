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
public class Ordenar_Por_Escola_E_Nome extends ProfessorPersistenciaTemplateMethod{
    //Construtores
   
    public Ordenar_Por_Escola_E_Nome() {
    }
    
    public Ordenar_Por_Escola_E_Nome(String nomeDoArquivo) {
        super(nomeDoArquivo);
    }

    //--------------------------------------------------------------------------
    //metodos
    
    @Override
    public boolean ePrimeiro(Professor professor1, Professor professor2) {
         if(professor1.getEscola().compareToIgnoreCase(professor2.getEscola()) == 0)
             return professor1.getNome().compareToIgnoreCase(professor2.getNome())<= 0;
        return professor1.getEscola().compareToIgnoreCase(professor2.getEscola()) < 0;
    }
}
