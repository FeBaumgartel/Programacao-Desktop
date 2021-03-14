/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.ArrayList;
import java.util.List;
import model.Medico;

/**
 *
 * @author felipe_baumgartel
 */
public class MedicoTableModel extends GenericTableModel<Medico> {

    private final String[] colunas = {"Matricula", "Nome", "Telefone", "Data de Nascimento",
        "Idade", "Formação", "Área de Atuação"};

    private List<Medico> list;

    private MedicoTableModel() {
        list = new ArrayList<>();
    }

    public MedicoTableModel(List<Medico> list) {
        this();
        setData(list);
    }

    @Override
    public void add(Medico entity) {
        list.add(0, entity);
        super.fireTableDataChanged();
    }

    @Override
    public void clear() {
        this.list.clear();
        super.fireTableDataChanged();
    }

    @Override
    public boolean contains(Medico entity) {
        return list.contains(entity);
    }

    @Override
    public Medico getValueAT(int row) {
        return list.get(row);
    }

    @Override
    public int indexOf(Medico entity) {
        return list.indexOf(entity);
    }

    @Override
    public List<Medico> list() {
        return list;
    }

    @Override
    public void remove(Medico entity) {
        list.remove(entity);
        super.fireTableDataChanged();
    }

    @Override
    public void setData(List<Medico> list) {
        this.list.clear();
        this.list.addAll(list);
        super.fireTableDataChanged();
    }

    @Override
    public void updateItem(int idx, Medico entity) {
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
        Medico medico = list.get(linha);
        switch (coluna) {
            case 0:
                return medico.getMatricula();
            case 1:
                return medico.getNome();
            case 2:
                return medico.getTelefone();
            case 3:
                return medico.getDataNascimento();
            case 4:
                return medico.getIdade();
            case 5:
                return medico.getFormacao();
            case 6:
                return medico.getAreaAtuacao();

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
