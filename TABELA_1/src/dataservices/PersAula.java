/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservices;

import java.util.ArrayList;
import java.util.List;
import model.Aula;

/**
 *
 * @author felipe_baumgartel
 */
public class PersAula {
    private static List<Aula> ListaDeAula = new ArrayList<>();

    public static List<Aula> list() {

        return ListaDeAula;
    }

    public static void save(Aula a) {
        if (!ListaDeAula.isEmpty()){
            if (verificarExistenciaDeAluno(a)){
                delete(a);
                ListaDeAula.add(a);
            }else{
                ListaDeAula.add(a);
            }
        }else
            ListaDeAula.add(a);
    }
    
    public static boolean verificarExistenciaDeAluno(Aula a){
        for (int i = 0; i < ListaDeAula.size(); i++) {
            if (a.equals(ListaDeAula.get(i))){
                return true;
            }
        }
        return false;
    }
    
    public static void delete(Aula a) {
        if (!ListaDeAula.isEmpty()) {
            for (int i = 0; i < ListaDeAula.size(); i++) {
                Aula aula = (Aula) ListaDeAula.get(i);
                if (aula.equals(a)) {
                    ListaDeAula.remove(a);
                }
            }
        }
    }  
}
