/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservices;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author felipe_baumgartel
 */
public class PersCliente {

    private static List<Cliente> ListaDeCliente = new ArrayList<>();

    public static List<Cliente> list() {

        return ListaDeCliente;
    }

    public static void save(Cliente a) {
        if (!ListaDeCliente.isEmpty()) {
            if (verificarExistenciaDeAluno(a)) {
                delete(a);
                ListaDeCliente.add(a);
            } else {
                ListaDeCliente.add(a);
            }
        } else {
            ListaDeCliente.add(a);
        }
    }

    public static boolean verificarExistenciaDeAluno(Cliente a) {
        for (int i = 0; i < ListaDeCliente.size(); i++) {
            if (a.equals(ListaDeCliente.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static void delete(Cliente a) {
        if (!ListaDeCliente.isEmpty()) {
            for (int i = 0; i < ListaDeCliente.size(); i++) {
                Cliente cliente = (Cliente) ListaDeCliente.get(i);
                if (cliente.equals(a)) {
                    ListaDeCliente.remove(a);
                }
            }
        }
    }
}
