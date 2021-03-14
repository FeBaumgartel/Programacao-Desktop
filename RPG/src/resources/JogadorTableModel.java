/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.ArrayList;
import java.util.List;
import model.Jogador;

/**
 *
 * @author felipe_baumgartel
 */
public class JogadorTableModel extends GenericTableModel<Jogador> {
    private final String[] colunas = {"Id", "Login", "Senha", "Email", "Data de Nascimento"};

    private List<Jogador> list;

    private JogadorTableModel() {
        list = new ArrayList<>();
    }

    public JogadorTableModel(List<Jogador> list){
        this();
        setData(list);
    }
    @Override
    public void add(Jogador entity) {
        list.add(0, entity);
    }

    @Override
    public void clear() {
        this.list.clear();
        super.fireTableDataChanged();
    }

    @Override
    public boolean contains(Jogador entity) {
        return list.contains(entity);
    }

    @Override
    public Jogador getValueAT(int row) {
        return list.get(row);
    }

    @Override
    public int indexOf(Jogador entity) {
        return list.indexOf(entity);
    }

    @Override
    public List<Jogador> list() {
        return list;
    }

    @Override
    public void remove(Jogador entity) {
        list.remove(entity);
        super.fireTableDataChanged();
    }

    @Override
    public void setData(List<Jogador> list) {
        this.list.clear();
        this.list.addAll(list);
        super.fireTableDataChanged();
    }

    @Override
    public void updateItem(int idx, Jogador entity) {
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
        Jogador jogador = list.get(linha);
        switch (coluna) {
            case 0:
                return jogador.getId();
            case 1:
                return jogador.getLogin();
            case 2:
                return jogador.getSenha();
            case 3:
                return jogador.getEmail();
            case 4:
                return jogador.getDataNascimento();
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
