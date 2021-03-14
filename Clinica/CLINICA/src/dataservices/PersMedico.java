/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservices;

import java.util.ArrayList;
import java.util.List;
import model.Medico;

/**
 *
 * @author felipe_baumgartel
 */
public class PersMedico {

    private static List<Medico> ListaDeMedico = new ArrayList<>();

    public static List<Medico> list() {

        return ListaDeMedico;
    }

    public static void save(Medico a) {
        if (!ListaDeMedico.isEmpty()) {
            if (verificarExistenciaDeAluno(a)) {
                delete(a);
                ListaDeMedico.add(a);
            } else {
                ListaDeMedico.add(a);
            }
        } else {
            ListaDeMedico.add(a);
        }
    }

    public static boolean verificarExistenciaDeAluno(Medico a) {
        for (int i = 0; i < ListaDeMedico.size(); i++) {
            if (a.equals(ListaDeMedico.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static void delete(Medico a) {
        if (!ListaDeMedico.isEmpty()) {
            for (int i = 0; i < ListaDeMedico.size(); i++) {
                Medico medico = (Medico) ListaDeMedico.get(i);
                if (medico.equals(a)) {
                    ListaDeMedico.remove(a);
                }
            }
        }
    }
}
