/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.ArrayList;
import java.util.List;
import model.Softwares;

/**
 *
 * @author felipe_baumgartel
 */
public class SoftwaresTableModel extends GenericTableModel<Softwares> {
    private final String[] colunas = {"Id", "Desenvolvedor", "Preco", "Descricao", "Quantidade"};

    private List<Softwares> list;

    private SoftwaresTableModel() {
        list = new ArrayList<>();
    }

    public SoftwaresTableModel(List<Softwares> list){
        this();
        setData(list);
    }
    @Override
    public void add(Softwares entity) {
        list.add(0, entity);
    }

    @Override
    public void clear() {
        this.list.clear();
        super.fireTableDataChanged();
    }

    @Override
    public boolean contains(Softwares entity) {
        return list.contains(entity);
    }

    @Override
    public Softwares getValueAT(int row) {
        return list.get(row);
    }

    @Override
    public int indexOf(Softwares entity) {
        return list.indexOf(entity);
    }

    @Override
    public List<Softwares> list() {
        return list;
    }

    @Override
    public void remove(Softwares entity) {
        list.remove(entity);
        super.fireTableDataChanged();
    }

    @Override
    public void setData(List<Softwares> list) {
        this.list.clear();
        this.list.addAll(list);
        super.fireTableDataChanged();
    }

    @Override
    public void updateItem(int idx, Softwares entity) {
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
        Softwares aluno = list.get(linha);
        switch (coluna) {
            case 0:
                return aluno.getId();
            case 1:
                return aluno.getDesenvolvedor();
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
