/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.ArrayList;
import java.util.List;
import model.Servicos;

/**
 *
 * @author felipe_baumgartel
 */
public class ServicosTableModel extends GenericTableModel<Servicos> {
    private final String[] colunas = {"Id", "Preco", "Descricao"};

    private List<Servicos> list;

    private ServicosTableModel() {
        list = new ArrayList<>();
    }

    public ServicosTableModel(List<Servicos> list){
        this();
        setData(list);
    }
    @Override
    public void add(Servicos entity) {
        list.add(0, entity);
    }

    @Override
    public void clear() {
        this.list.clear();
        super.fireTableDataChanged();
    }

    @Override
    public boolean contains(Servicos entity) {
        return list.contains(entity);
    }

    @Override
    public Servicos getValueAT(int row) {
        return list.get(row);
    }

    @Override
    public int indexOf(Servicos entity) {
        return list.indexOf(entity);
    }

    @Override
    public List<Servicos> list() {
        return list;
    }

    @Override
    public void remove(Servicos entity) {
        list.remove(entity);
        super.fireTableDataChanged();
    }

    @Override
    public void setData(List<Servicos> list) {
        this.list.clear();
        this.list.addAll(list);
        super.fireTableDataChanged();
    }

    @Override
    public void updateItem(int idx, Servicos entity) {
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
        Servicos aluno = list.get(linha);
        switch (coluna) {
            case 0:
                return aluno.getId();
            case 1:
                return aluno.getPreco();
            case 2:
                return aluno.getDescricao();
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
