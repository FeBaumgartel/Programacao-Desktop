/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.ArrayList;
import java.util.List;
import model.Notebooks;

/**
 *
 * @author felipe_baumgartel
 */
public class NotebooksTableModel extends GenericTableModel<Notebooks> {
    
    private final String[] colunas = {"Id", "Marca", "Preco", "Descricao", "Quantidade"};

    private List<Notebooks> list;

    private NotebooksTableModel() {
        list = new ArrayList<>();
    }

    public NotebooksTableModel(List<Notebooks> list){
        this();
        setData(list);
    }
    @Override
    public void add(Notebooks entity) {
        list.add(0, entity);
    }

    @Override
    public void clear() {
        this.list.clear();
        super.fireTableDataChanged();
    }

    @Override
    public boolean contains(Notebooks entity) {
        return list.contains(entity);
    }

    @Override
    public Notebooks getValueAT(int row) {
        return list.get(row);
    }

    @Override
    public int indexOf(Notebooks entity) {
        return list.indexOf(entity);
    }

    @Override
    public List<Notebooks> list() {
        return list;
    }

    @Override
    public void remove(Notebooks entity) {
        list.remove(entity);
        super.fireTableDataChanged();
    }

    @Override
    public void setData(List<Notebooks> list) {
        this.list.clear();
        this.list.addAll(list);
        super.fireTableDataChanged();
    }

    @Override
    public void updateItem(int idx, Notebooks entity) {
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
        Notebooks aluno = list.get(linha);
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
