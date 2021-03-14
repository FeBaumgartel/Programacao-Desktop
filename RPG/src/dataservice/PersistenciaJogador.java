/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice;

import java.util.ArrayList;
import java.util.List;
import model.Jogador;

/**
 *
 * @author felipe_baumgartel
 */
public class PersistenciaJogador {

    private static List<Jogador> ListaDeJogador = new ArrayList<Jogador>();

    public static void save(Jogador a) {
        if (!ListaDeJogador.isEmpty()){
            if (verificarExistenciaDeJogador(a)){
                delete(a);
                ListaDeJogador.add(a);
            }else{
                ListaDeJogador.add(a);
            }
        }else
            ListaDeJogador.add(a);
    }
    
    public static boolean verificarExistenciaDeJogador(Jogador a){
        for (int i = 0; i < ListaDeJogador.size(); i++) {
            if (a.equals(ListaDeJogador.get(i))){
                return true;
            }
        }
        return false;
    }

    public static List<Jogador> list() {
        return ListaDeJogador;
    }

    public static void delete(Jogador a) {
        if (!ListaDeJogador.isEmpty()) {
            for (int i = 0; i < ListaDeJogador.size(); i++) {
                Jogador jogador = (Jogador) ListaDeJogador.get(i);
                if (jogador.equals(a)) {
                    ListaDeJogador.remove(a);
                }
            }
        }
    }
}
