/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice;

import model.Pecas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipe_baumgartel
 */
public class PersistenciaPecas {

    private static List<Pecas> ListaDePeca = new ArrayList<Pecas>();

    public static void save(Pecas t) {
        if (ListaDePeca.isEmpty()) {
            ListaDePeca.add(t);
        } else {
            for (int i = 0; i < ListaDePeca.size(); i++) {
                Pecas a = (Pecas) ListaDePeca.get(i);
                if (a.getId() == t.getId()) {
                    ListaDePeca.add(i, t);
                    break;
                } else {
                    ListaDePeca.add(t);
                    break;
                }
            }
        }
    }

    public static List<Pecas> list() {
        return ListaDePeca;
    }
}
