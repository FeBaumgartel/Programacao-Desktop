/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservices;

import java.util.ArrayList;
import java.util.List;
import model.Professor;

/**
 *
 * @author felipe_baumgartel
 */
public class PersProf {
  
    private static List<Professor> ListaDeProfessor = new ArrayList<>();

    public static List<Professor> list() {

        return ListaDeProfessor;
    }

    public static void save(Professor a) {
        if (!ListaDeProfessor.isEmpty()){
            if (verificarExistenciaDeAluno(a)){
                delete(a);
                ListaDeProfessor.add(a);
            }else{
                ListaDeProfessor.add(a);
            }
        }else
            ListaDeProfessor.add(a);
    }
    
    public static boolean verificarExistenciaDeAluno(Professor a){
        for (int i = 0; i < ListaDeProfessor.size(); i++) {
            if (a.equals(ListaDeProfessor.get(i))){
                return true;
            }
        }
        return false;
    }
    
    public static void delete(Professor a) {
        if (!ListaDeProfessor.isEmpty()) {
            for (int i = 0; i < ListaDeProfessor.size(); i++) {
                Professor professor = (Professor) ListaDeProfessor.get(i);
                if (professor.equals(a)) {
                    ListaDeProfessor.remove(a);
                }
            }
        }
    }  
}
