/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice;

import java.util.ArrayList;
import java.util.List;
import model.Fornecedor;

/**
 *
 * @author felipe_baumgartel
 */
public class PersistenciaFornecedor {

    private static List<Fornecedor> ListaDeFornecedor = new ArrayList<Fornecedor>();

    public static void save(Fornecedor t) {
        if (ListaDeFornecedor.isEmpty()) {
            ListaDeFornecedor.add(t);
        } else {
            for (int i = 0; i < ListaDeFornecedor.size(); i++) {
                Fornecedor a = (Fornecedor) ListaDeFornecedor.get(i);
                if (a.getId() == t.getId()) {
                    ListaDeFornecedor.add(i, t);
                    break;
                } else {
                    ListaDeFornecedor.add(t);
                    break;
                }
            }
        }
    }

    public static List<Fornecedor> list() {
        return ListaDeFornecedor;
    }
}
