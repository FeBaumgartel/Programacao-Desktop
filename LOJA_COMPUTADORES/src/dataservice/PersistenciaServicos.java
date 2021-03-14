/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice;

import model.Servicos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author felipe_baumgartel
 */
public class PersistenciaServicos {

    private static List<Servicos> ListaDeServico = new ArrayList<Servicos>();

    public static void save(Servicos t) {
        if (ListaDeServico.isEmpty()) {
            ListaDeServico.add(t);
        } else {
            for (int i = 0; i < ListaDeServico.size(); i++) {
                Servicos a = (Servicos) ListaDeServico.get(i);
                if (a.getId() == t.getId()) {
                    ListaDeServico.add(i, t);
                    break;
                } else {
                    ListaDeServico.add(t);
                    break;
                }
            }
        }
    }

    public static List<Servicos> list() {
        return ListaDeServico;
    }
}
