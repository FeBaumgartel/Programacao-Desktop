package resources;

import domain.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoTableModel extends GenericTableModel<Aluno> {

    private final String[] colunas = {"Matricula", "Nome", "CPF", "Sexo",
       "Email", "Endereço", "Data de Nascimento"};
    
    
    
    private List<Aluno> list;

    private AlunoTableModel() {
        list = new ArrayList<>();
    }

    public AlunoTableModel(List<Aluno> list) {
        this();
        setData(list);
    }

    @Override
    public void add(Aluno entity) {
        list.add(0, entity);
        super.fireTableDataChanged();
    }

    @Override
    public void clear() {
        this.list.clear();
        super.fireTableDataChanged();
    }

    @Override
    public boolean contains(Aluno entity) {
        return list.contains(entity);
    }

    @Override
    public Aluno getValueAT(int row) {
        return list.get(row);
    }

    @Override
    public int indexOf(Aluno entity) {
        return list.indexOf(entity);
    }

    @Override
    public List<Aluno> list() {
        return list;
    }

    @Override
    public void remove(Aluno entity) {
        list.remove(entity);
        super.fireTableDataChanged();
    }

    @Override
    public void setData(List<Aluno> list) {
        this.list.clear();
        this.list.addAll(list);
        super.fireTableDataChanged();
    }

    @Override
    public void updateItem(int idx, Aluno entity) {
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
        Aluno aluno = list.get(linha);
        switch (coluna) {
            case 0:
                return aluno.getMatricula();
            case 1:
                return aluno.getNome();
            case 2:
                return aluno.getCPF();
            case 3:
                return aluno.getSexo();
            case 4:
                return aluno.getEmail();
            case 5:
                return aluno.getEndereco();
            case 6:
                return aluno.getDataNascimento();

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
