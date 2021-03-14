/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.ArrayList;
import java.util.List;
import model.Produto;

/**
 *
 * @author felipe_baumgartel
 */
public class ProdutoTableModel extends GenericTableModel<Produto> {
    
    private final String[] colunas = {"ID", "Quantidade", "Nome", "Descrição", "Validade", "Lote"};

    private List<Produto> list;

    private ProdutoTableModel() {
        list = new ArrayList<>();
    }

    public ProdutoTableModel(List<Produto> list) {
        this();
        setData(list);
    }

    @Override
    public void add(Produto entity) {
        list.add(0, entity);
    }

    @Override
    public void clear() {
        this.list.clear();
        super.fireTableDataChanged();
    }

    @Override
    public boolean contains(Produto entity) {
        return list.contains(entity);
    }

    @Override
    public Produto getValueAT(int row) {
        return list.get(row);
    }

    @Override
    public int indexOf(Produto entity) {
        return list.indexOf(entity);
    }

    @Override
    public List<Produto> list() {
        return list;
    }

    @Override
    public void remove(Produto entity) {
        list.remove(entity);
        super.fireTableDataChanged();
    }

    @Override
    public void setData(List<Produto> list) {
        this.list.clear();
        this.list.addAll(list);
        super.fireTableDataChanged();
    }

    @Override
    public void updateItem(int idx, Produto entity) {
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
        Produto produto = list.get(linha);
        switch (coluna) {
            case 0:
                return produto.getId();
            case 1:
                return produto.getQuantidade();
            case 2:
                return produto.getNome();
            case 3:
                return produto.getDescricao();
            case 4:
                return produto.getValidade();
            case 5:
                return produto.getLote();
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
