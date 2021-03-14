/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.ArrayList;
import java.util.List;
import model.Consulta;

/**
 *
 * @author felipe_baumgartel
 */
public class ConsultaTableModel extends GenericTableModel<Consulta> {

    private final String[] colunas = {"ID", "Medico", "Consulta", "Data da Consulta",
        "Lista de Medicamentos", "Observações"};

    private List<Consulta> list;

    private ConsultaTableModel() {
        list = new ArrayList<>();
    }

    public ConsultaTableModel(List<Consulta> list) {
        this();
        setData(list);
    }

    @Override
    public void add(Consulta entity) {
        list.add(0, entity);
        super.fireTableDataChanged();
    }

    @Override
    public void clear() {
        this.list.clear();
        super.fireTableDataChanged();
    }

    @Override
    public boolean contains(Consulta entity) {
        return list.contains(entity);
    }

    @Override
    public Consulta getValueAT(int row) {
        return list.get(row);
    }

    @Override
    public int indexOf(Consulta entity) {
        return list.indexOf(entity);
    }

    @Override
    public List<Consulta> list() {
        return list;
    }

    @Override
    public void remove(Consulta entity) {
        list.remove(entity);
        super.fireTableDataChanged();
    }

    @Override
    public void setData(List<Consulta> list) {
        this.list.clear();
        this.list.addAll(list);
        super.fireTableDataChanged();
    }

    @Override
    public void updateItem(int idx, Consulta entity) {
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
        Consulta consulta = list.get(linha);
        switch (coluna) {
            case 0:
                return consulta.getID();
            case 1:
                return consulta.getMedico().getNome();
            case 2:
                return consulta.getCliente().getNome();
            case 3:
                return consulta.getDataConsulta();
            case 4:
                return consulta.getListaMedicamentos();
            case 5:
                return consulta.getObservacoes();
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
