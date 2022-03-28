/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;
import classededados.Professor;
import persistencia.ProfessorPersistenciaTemplateMethod;
import persistencia.*;
//import persistencia.OrdenarPorNome;
/**
 *
 * @author denner
 */


public class FabricaOrdenacao {
    
    public enum Ordenacao{
        MATRICULA, NOME, ESCOLA_E_NOME, TITULACAO_E_MATRICULA, ESCOLA_TITULACAO_NOME;
    }
    
    public static ProfessorPersistenciaTemplateMethod getOrdenacao(String tipoDeOrdenacao){
        Ordenacao tipo = Ordenacao.valueOf(tipoDeOrdenacao);
        switch (tipo){
            case MATRICULA:
                return new OrdenarPorMatricula("./src/dados/ProfessoresDaEscola 2.csv");
            case NOME:
                return new OrdenarPorNome("./src/dados/ProfessoresDaEscola 2.csv");
            case ESCOLA_E_NOME:
                return new Ordenar_Por_Escola_E_Nome("./src/dados/ProfessoresDaEscola 2.csv");
            case TITULACAO_E_MATRICULA:
                return new Ordenar_Por_Titulacao_E_Matricula("./src/dados/ProfessoresDaEscola 2.csv");
            case ESCOLA_TITULACAO_NOME:
                return new Ordenar_Por_Escola_TItulacao_Nome("./src/dados/ProfessoresDaEscola 2.csv");
            
            default:
                return null;
        }
    }
}
