/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.ArrayList;
import java.util.List;
import model.Professor;

/**
 *
 * @author felipe_baumgartel
 */
public class ProfessorTableModel extends GenericTableModel<Professor> {
    
    private final String[] colunas = {"Codigo", "Nome", "CPF", "Sexo",
       "Email", "Endereço", "Data de Nascimento"};
    
    
    
    private List<Professor> list;

    private ProfessorTableModel() {
        list = new ArrayList<>();
    }

    public ProfessorTableModel(List<Professor> list) {
        this();
        setData(list);
    }

    @Override
    public void add(Professor entity) {
        list.add(0, entity);
        super.fireTableDataChanged();
    }

    @Override
    public void clear() {
        this.list.clear();
        super.fireTableDataChanged();
    }

    @Override
    public boolean contains(Professor entity) {
        return list.contains(entity);
    }

    @Override
    public Professor getValueAT(int row) {
        return list.get(row);
    }

    @Override
    public int indexOf(Professor entity) {
        return list.indexOf(entity);
    }

    @Override
    public List<Professor> list() {
        return list;
    }

    @Override
    public void remove(Professor entity) {
        list.remove(entity);
        super.fireTableDataChanged();
    }

    @Override
    public void setData(List<Professor> list) {
        this.list.clear();
        this.list.addAll(list);
        super.fireTableDataChanged();
    }

    @Override
    public void updateItem(int idx, Professor entity) {
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
        Professor professor = list.get(linha);
        switch (coluna) {
            case 0:
                return professor.getCod();
            case 1:
                return professor.getNome();
            case 2:
                return professor.getCPF();
            case 3:
                return professor.getSexo();
            case 4:
                return professor.getEmail();
            case 5:
                return professor.getEndereco();
            case 6:
                return professor.getDataNascimento();

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
