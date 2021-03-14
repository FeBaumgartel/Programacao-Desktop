/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice;

import java.util.ArrayList;
import java.util.List;
import model.Personagem;

/**
 *
 * @author felipe_baumgartel
 */
public class PersistenciaPersonagem {

    private static List<Personagem> ListaDePersonagem = new ArrayList<Personagem>();

    public static void save(Personagem a) {
        if (!ListaDePersonagem.isEmpty()){
            if (verificarExistenciaDePersonagem(a)){
                delete(a);
                ListaDePersonagem.add(a);
            }else{
                ListaDePersonagem.add(a);
            }
        }else
            ListaDePersonagem.add(a);
    }
    
    public static boolean verificarExistenciaDePersonagem(Personagem a){
        for (int i = 0; i < ListaDePersonagem.size(); i++) {
            if (a.equals(ListaDePersonagem.get(i))){
                return true;
            }
        }
        return false;
    }

    public static List<Personagem> list() {
        return ListaDePersonagem;
    }

    public static void delete(Personagem a) {
        if (!ListaDePersonagem.isEmpty()) {
            for (int i = 0; i < ListaDePersonagem.size(); i++) {
                Personagem personagem = (Personagem) ListaDePersonagem.get(i);
                if (personagem.equals(a)) {
                    ListaDePersonagem.remove(a);
                }
            }
        }
    }
}
