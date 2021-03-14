/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice;

import java.util.ArrayList;
import java.util.List;
import model.Produto;

/**
 *
 * @author felipe_baumgartel
 */
public class PersistenciaProduto {

    private static List<Produto> ListaDeProduto = new ArrayList<Produto>();

    public static void save(Produto t) {
        if (ListaDeProduto.isEmpty()) {
            ListaDeProduto.add(t);
        } else {
            for (int i = 0; i < ListaDeProduto.size(); i++) {
                Produto a = (Produto) ListaDeProduto.get(i);
                if (a.getId() == t.getId()) {
                    ListaDeProduto.add(i, t);
                    break;
                } else {
                    ListaDeProduto.add(t);
                    break;
                }
            }
        }
    }

    public static List<Produto> list() {
        return ListaDeProduto;
    }
}
