/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice;

import model.Desktops;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipe_baumgartel
 */
public class PersistenciaDesktops {

    private static List<Desktops> ListaDeDesktop = new ArrayList<Desktops>();

    public static void save(Desktops t) {
        if (ListaDeDesktop.isEmpty()) {
            ListaDeDesktop.add(t);
        } else {
            for (int i = 0; i < ListaDeDesktop.size(); i++) {
                Desktops a = (Desktops) ListaDeDesktop.get(i);
                if (a.getId() == t.getId()) {
                    ListaDeDesktop.add(i, t);
                    break;
                } else {
                    ListaDeDesktop.add(t);
                    break;
                }
            }
        }
    }

    public static List<Desktops> list() {
        return ListaDeDesktop;
    }
}
