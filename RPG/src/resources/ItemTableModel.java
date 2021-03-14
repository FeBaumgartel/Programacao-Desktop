/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.ArrayList;
import java.util.List;
import model.Item;

/**
 *
 * @author felipe_baumgartel
 */
public class ItemTableModel extends GenericTableModel<Item> {

    private final String[] colunas = {"Id", "Nome", "Descricao", "Peso", "Ataque", "Defesa", "Tipo", "Atributo", "Nivel"};

    private List<Item> list;

    private ItemTableModel() {
        list = new ArrayList<>();
    }

    public ItemTableModel(List<Item> list) {
        this();
        setData(list);
    }

    @Override
    public void add(Item entity) {
        list.add(0, entity);
    }

    @Override
    public void clear() {
        this.list.clear();
        super.fireTableDataChanged();
    }

    @Override
    public boolean contains(Item entity) {
        return list.contains(entity);
    }

    @Override
    public Item getValueAT(int row) {
        return list.get(row);
    }

    @Override
    public int indexOf(Item entity) {
        return list.indexOf(entity);
    }

    @Override
    public List<Item> list() {
        return list;
    }

    @Override
    public void remove(Item entity) {
        list.remove(entity);
        super.fireTableDataChanged();
    }

    @Override
    public void setData(List<Item> list) {
        this.list.clear();
        this.list.addAll(list);
        super.fireTableDataChanged();
    }

    @Override
    public void updateItem(int idx, Item entity) {
        list.set(idx, entity);
        super.fireTableDataChanged();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Item item = list.get(linha);
        switch (coluna) {
            case 0:
                return item.getId();
            case 1:
                return item.getNome();
            case 2:
                return item.getDescricao();
            case 3:
                return item.getPeso();
            case 4:
                return item.getAtaque();
            case 5:
                return item.getDefesa();
            case 6:
                return item.getTipo();
            case 7:
                return item.getAtributo();
            case 8:
                return item.getNivel();
        }
        return null;
    }

    @Override
    public String getColumnName(int col) {
        return colunas[col];
    }

    public String[] getColumnName() {
        return colunas;
    }
}
