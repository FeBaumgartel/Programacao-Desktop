/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.ArrayList;
import java.util.List;
import model.Desktops;

/**
 *
 * @author felipe_baumgartel
 */
public class DesktopsTableModel extends GenericTableModel<Desktops> {
    private final String[] colunas = {"Id", "Marca", "Preco", "Descricao", "Quantidade"};

    private List<Desktops> list;

    private DesktopsTableModel() {
        list = new ArrayList<>();
    }

    public DesktopsTableModel(List<Desktops> list){
        this();
        setData(list);
    }
    @Override
    public void add(Desktops entity) {
        list.add(0, entity);
    }

    @Override
    public void clear() {
        this.list.clear();
        super.fireTableDataChanged();
    }

    @Override
    public boolean contains(Desktops entity) {
        return list.contains(entity);
    }

    @Override
    public Desktops getValueAT(int row) {
        return list.get(row);
    }

    @Override
    public int indexOf(Desktops entity) {
        return list.indexOf(entity);
    }

    @Override
    public List<Desktops> list() {
        return list;
    }

    @Override
    public void remove(Desktops entity) {
        list.remove(entity);
        super.fireTableDataChanged();
    }

    @Override
    public void setData(List<Desktops> list) {
        this.list.clear();
        this.list.addAll(list);
        super.fireTableDataChanged();
    }

    @Override
    public void updateItem(int idx, Desktops entity) {
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
        Desktops aluno = list.get(linha);
        switch (coluna) {
            case 0:
                return aluno.getId();
            case 1:
                return aluno.getMarca();
            case 2:
                return aluno.getPreco();
            case 3:
                return aluno.getDescricao();
            case 4:
                return aluno.getQuantidade();
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
