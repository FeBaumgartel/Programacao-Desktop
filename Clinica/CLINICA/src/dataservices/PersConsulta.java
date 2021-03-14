/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservices;

import java.util.ArrayList;
import java.util.List;
import model.Consulta;

/**
 *
 * @author felipe_baumgartel
 */
public class PersConsulta {

    private static List<Consulta> ListaDeConsulta = new ArrayList<>();

    public static List<Consulta> list() {

        return ListaDeConsulta;
    }

    public static void save(Consulta a) {
        if (!ListaDeConsulta.isEmpty()) {
            if (verificarExistenciaDeAluno(a)) {
                delete(a);
                ListaDeConsulta.add(a);
            } else {
                ListaDeConsulta.add(a);
            }
        } else {
            ListaDeConsulta.add(a);
        }
    }

    public static boolean verificarExistenciaDeAluno(Consulta a) {
        for (int i = 0; i < ListaDeConsulta.size(); i++) {
            if (a.equals(ListaDeConsulta.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static void delete(Consulta a) {
        if (!ListaDeConsulta.isEmpty()) {
            for (int i = 0; i < ListaDeConsulta.size(); i++) {
                Consulta consulta = (Consulta) ListaDeConsulta.get(i);
                if (consulta.equals(a)) {
                    ListaDeConsulta.remove(a);
                }
            }
        }
    }
}
