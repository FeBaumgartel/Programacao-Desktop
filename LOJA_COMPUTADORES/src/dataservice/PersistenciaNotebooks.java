/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice;

import model.Notebooks;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipe_baumgartel
 */
public class PersistenciaNotebooks {

    private static List<Notebooks> ListaDeNotebook = new ArrayList<Notebooks>();

    public static void save(Notebooks t) {
        if (ListaDeNotebook.isEmpty()) {
            ListaDeNotebook.add(t);
        } else {
            for (int i = 0; i < ListaDeNotebook.size(); i++) {
                Notebooks a = (Notebooks) ListaDeNotebook.get(i);
                if (a.getId() == t.getId()) {
                    ListaDeNotebook.add(i, t);
                    break;
                } else {
                    ListaDeNotebook.add(t);
                    break;
                }
            }
        }
    }

    public static List<Notebooks> list() {
        return ListaDeNotebook;
    }
}
