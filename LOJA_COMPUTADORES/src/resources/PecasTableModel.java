/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.ArrayList;
import java.util.List;
import model.Pecas;

/**
 *
 * @author felipe_baumgartel
 */
public class PecasTableModel extends GenericTableModel<Pecas> {
    private final String[] colunas = {"Id", "Marca", "Preco", "Descricao", "Quantidade"};

    private List<Pecas> list;

    private PecasTableModel() {
        list = new ArrayList<>();
    }

    public PecasTableModel(List<Pecas> list){
        this();
        setData(list);
    }
    @Override
    public void add(Pecas entity) {
        list.add(0, entity);
    }

    @Override
    public void clear() {
        this.list.clear();
        super.fireTableDataChanged();
    }

    @Override
    public boolean contains(Pecas entity) {
        return list.contains(entity);
    }

    @Override
    public Pecas getValueAT(int row) {
        return list.get(row);
    }

    @Override
    public int indexOf(Pecas entity) {
        return list.indexOf(entity);
    }

    @Override
    public List<Pecas> list() {
        return list;
    }

    @Override
    public void remove(Pecas entity) {
        list.remove(entity);
        super.fireTableDataChanged();
    }

    @Override
    public void setData(List<Pecas> list) {
        this.list.clear();
        this.list.addAll(list);
        super.fireTableDataChanged();
    }

    @Override
    public void updateItem(int idx, Pecas entity) {
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
        Pecas aluno = list.get(linha);
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
