package domain;

import dataservices.dao.AlunoDAO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aluno {
    
    private int matricula;
    private String nome;
    private long CPF;
    private Sexo sexo;
    private String email;
    private String endereco;
    private LocalDate dataNascimento;
    
    AlunoDAO dao = new AlunoDAO();

    public Aluno(int matricula, String nome, long CPF, Sexo sexo, String email, String endereco, LocalDate dataNascimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.CPF = CPF;
        this.sexo = sexo;
        this.email = email;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }
    
    public Aluno(){
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.matricula;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome=" + nome + ", CPF=" + CPF + ", "
                + "sexo=" + sexo + ", email=" + email + ", endereco=" + endereco + ", dataNascimento=" + dataNascimento + '}';
    }
    
    public boolean verificarExistenciaDeAluno(Aluno a){
        List<Aluno> lista = dao.list();
        
        for (int i = 0; i < lista.size(); i++) {
            if (a.equals(lista.get(i))){
                return true;
            }
        }
        return false;
    }
}