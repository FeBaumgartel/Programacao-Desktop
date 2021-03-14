/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice;

import model.Softwares;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipe_baumgartel
 */
public class PersistenciaSoftwares {

    private static List<Softwares> ListaDeSoftware = new ArrayList<Softwares>();

    public static void save(Softwares t) {
        if (ListaDeSoftware.isEmpty()) {
            ListaDeSoftware.add(t);
        } else {
            for (int i = 0; i < ListaDeSoftware.size(); i++) {
                Softwares a = (Softwares) ListaDeSoftware.get(i);
                if (a.getId() == t.getId()) {
                    ListaDeSoftware.add(i, t);
                    break;
                } else {
                    ListaDeSoftware.add(t);
                    break;
                }
            }
        }
    }

    public static List<Softwares> list() {
        return ListaDeSoftware;
    }
}
