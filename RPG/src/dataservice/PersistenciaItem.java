/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataservice;

import java.util.ArrayList;
import java.util.List;
import model.Item;

/**
 *
 * @author felipe_baumgartel
 */
public class PersistenciaItem {

    private static List<Item> ListaDeItem = new ArrayList<Item>();

    public static void save(Item a) {
        if (!ListaDeItem.isEmpty()){
            if (verificarExistenciaDeItem(a)){
                delete(a);
                ListaDeItem.add(a);
            }else{
                ListaDeItem.add(a);
            }
        }else
            ListaDeItem.add(a);
    }
    
    public static boolean verificarExistenciaDeItem(Item a){
        for (int i = 0; i < ListaDeItem.size(); i++) {
            if (a.equals(ListaDeItem.get(i))){
                return true;
            }
        }
        return false;
    }

    public static List<Item> list() {
        return ListaDeItem;
    }

    public static void delete(Item a) {
        if (!ListaDeItem.isEmpty()) {
            for (int i = 0; i < ListaDeItem.size(); i++) {
                Item item = (Item) ListaDeItem.get(i);
                if (item.equals(a)) {
                    ListaDeItem.remove(a);
                }
            }
        }
    }
}
