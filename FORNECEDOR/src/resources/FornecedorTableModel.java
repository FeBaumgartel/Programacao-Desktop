/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.ArrayList;
import java.util.List;
import model.Fornecedor;

/**
 *
 * @author felipe_baumgartel
 */
public class FornecedorTableModel extends GenericTableModel<Fornecedor> {

    private final String[] colunas = {"ID", "Nome", "CNPJ", "CEP", "Rua", "Número", "Bairro", "Cidade", "Estado"};

    private List<Fornecedor> list;

    private FornecedorTableModel() {
        list = new ArrayList<>();
    }

    public FornecedorTableModel(List<Fornecedor> list) {
        this();
        setData(list);
    }

    @Override
    public void add(Fornecedor entity) {
        list.add(0, entity);
    }

    @Override
    public void clear() {
        this.list.clear();
        super.fireTableDataChanged();
    }

    @Override
    public boolean contains(Fornecedor entity) {
        return list.contains(entity);
    }

    @Override
    public Fornecedor getValueAT(int row) {
        return list.get(row);
    }

    @Override
    public int indexOf(Fornecedor entity) {
        return list.indexOf(entity);
    }

    @Override
    public List<Fornecedor> list() {
        return list;
    }

    @Override
    public void remove(Fornecedor entity) {
        list.remove(entity);
        super.fireTableDataChanged();
    }

    @Override
    public void setData(List<Fornecedor> list) {
        this.list.clear();
        this.list.addAll(list);
        super.fireTableDataChanged();
    }

    @Override
    public void updateItem(int idx, Fornecedor entity) {
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
        Fornecedor fornecedor = list.get(linha);
        switch (coluna) {
            case 0:
                return fornecedor.getId();
            case 1:
                return fornecedor.getNome();
            case 2:
                return fornecedor.getCnpj();
            case 3:
                return fornecedor.endereco.getCep();
            case 4:
                return fornecedor.endereco.getRua();
            case 5:
                return fornecedor.endereco.getNumero();
            case 6:
                return fornecedor.endereco.getBairro();
            case 7:
                return fornecedor.endereco.getCidade();
            case 8:
                return fornecedor.endereco.getEstado();
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
