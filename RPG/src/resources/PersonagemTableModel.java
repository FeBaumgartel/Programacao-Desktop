/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.util.ArrayList;
import java.util.List;
import model.Personagem;

/**
 *
 * @author felipe_baumgartel
 */
public class PersonagemTableModel extends GenericTableModel<Personagem> {

    private final String[] colunas = {"Id", "Nome", "Nível", "Vida", "Ataque", "Defesa", "Experiência", "Dinheiro"};

    private List<Personagem> list;

    private PersonagemTableModel() {
        list = new ArrayList<>();
    }

    public PersonagemTableModel(List<Personagem> list) {
        this();
        setData(list);
    }

    @Override
    public void add(Personagem entity) {
        list.add(0, entity);
    }

    @Override
    public void clear() {
        this.list.clear();
        super.fireTableDataChanged();
    }

    @Override
    public boolean contains(Personagem entity) {
        return list.contains(entity);
    }

    @Override
    public Personagem getValueAT(int row) {
        return list.get(row);
    }

    @Override
    public int indexOf(Personagem entity) {
        return list.indexOf(entity);
    }

    @Override
    public List<Personagem> list() {
        return list;
    }

    @Override
    public void remove(Personagem entity) {
        list.remove(entity);
        super.fireTableDataChanged();
    }

    @Override
    public void setData(List<Personagem> list) {
        this.list.clear();
        this.list.addAll(list);
        super.fireTableDataChanged();
    }

    @Override
    public void updateItem(int idx, Personagem entity) {
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
        Personagem personagem = list.get(linha);
        switch (coluna) {
            case 0:
                return personagem.getId();
            case 1:
                return personagem.getNome();
            case 2:
                return personagem.getNivel();
            case 3:
                return personagem.getVida();
            case 4:
                return personagem.getAtaque();
            case 5:
                return personagem.getDefesa();
            case 6:
                return personagem.getExperiencia();
            case 7:
                return personagem.getDinheiro();
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
