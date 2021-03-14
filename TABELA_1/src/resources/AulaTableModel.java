/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.ArrayList;
import java.util.List;
import model.Aula;

/**
 *
 * @author felipe_baumgartel
 */
public class AulaTableModel extends GenericTableModel<Aula> {

    private final String[] colunas = {"Id", "Professor", "Aluno", "Disciplina", "Data da Aula"};

    private List<Aula> list;

    private AulaTableModel() {
        list = new ArrayList<>();
    }

    public AulaTableModel(List<Aula> list) {
        this();
        setData(list);
    }

    @Override
    public void add(Aula entity) {
        list.add(0, entity);
        super.fireTableDataChanged();
    }

    @Override
    public void clear() {
        this.list.clear();
        super.fireTableDataChanged();
    }

    @Override
    public boolean contains(Aula entity) {
        return list.contains(entity);
    }

    @Override
    public Aula getValueAT(int row) {
        return list.get(row);
    }

    @Override
    public int indexOf(Aula entity) {
        return list.indexOf(entity);
    }

    @Override
    public List<Aula> list() {
        return list;
    }

    @Override
    public void remove(Aula entity) {
        list.remove(entity);
        super.fireTableDataChanged();
    }

    @Override
    public void setData(List<Aula> list) {
        this.list.clear();
        this.list.addAll(list);
        super.fireTableDataChanged();
    }

    @Override
    public void updateItem(int idx, Aula entity) {
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
        Aula aula = list.get(linha);
        switch (coluna) {
            case 0:
                return aula.getId();
            case 1:
                return aula.getProfessor().getNome();
            case 2:
                return aula.getAluno().getNome();
            case 3:
                return aula.getDisciplina();
            case 4:
                return aula.getDataAula();

        }
        return null;
    }

    @Override
    public String getColumnName(int col) {
        return colunas[col];
    }

    public String[] getColumnNames() {
        return colunas;
    }
}
